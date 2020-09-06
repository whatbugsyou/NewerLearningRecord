package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	private static Connection connection = null;
	private static Statement statement = null ; 
	private  DBUtil() {
	}
	public static Connection createConnection() {
		if (connection == null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/h?useSSL=false", "root", "123");
				statement = connection.createStatement();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("连接失败");
				e.printStackTrace();
			}
		}
		return connection;
	}
	public static void close() {
		try {
			statement.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("关闭失败");
			e.printStackTrace();
		}
	}
	public static void update(String sql) {
		if(statement!=null) {
			try {
				statement.executeUpdate(sql);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("执行sql失败");
				e.printStackTrace();
			}
		}else {
			System.out.println("未连接数据库，执行失败");
		}
	}
}
