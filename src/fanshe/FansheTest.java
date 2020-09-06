package fanshe;
/**
 * 存在空白节点问题
 */
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class FansheTest {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse("src/fanshe/Servlet.xml");
		
		Element root = document.getDocumentElement();
		NodeList nodeList = root.getElementsByTagName("servlet");
		String name="/login";
		for (int i = 0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(i);
			Node lastChild = node.getLastChild();
			String textContent = lastChild.getTextContent();
			if(textContent.equals(name)) {
				name = node.getPreviousSibling().getTextContent();
			}
		}
		
		NodeList list = document.getElementsByTagName(name);
		String clazzS = list.item(0).getNextSibling().getTextContent();
		Class<?> class1 = Class.forName(clazzS);
		Method method = class1.getMethod("service");
		method.invoke(class1.newInstance());
		
	}
}
