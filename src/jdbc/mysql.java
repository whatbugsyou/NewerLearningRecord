package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//oracle jdbc:oracle:thin:@localhost:1521:orcl 
//mysql jdbc:mysql://localhost/myDB?useUnicod
public class mysql {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection connection = DBUtil.createConnection();
		//Statement statement = connection.createStatement();
		String sql="select name from h1 where 1=1 or 'sex'=?";
		PreparedStatement prepareStatement = connection.prepareStatement(sql);
		String str ="sex";
		//设置字符串在sql中会加‘’,指定列名查询可用字符串变量拼接最初的sql。
		prepareStatement.setString(1, str);
		System.out.println(prepareStatement.toString());
		ResultSet resultSet2 = prepareStatement.executeQuery();
		//ResultSet resultSet = statement.executeQuery(sql);
		while(resultSet2.next()) {
			System.out.println(resultSet2.getString(1));
		}
		resultSet2.close();
		connection.close();
		
	}
}