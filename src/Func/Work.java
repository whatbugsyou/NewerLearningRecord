package Func;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Work {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
			DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document document = builder.parse("src/Func/func.xml");
			Element root = document.getDocumentElement();
			NodeList nodeList = root.getElementsByTagName("func");
			Scanner scanner = new Scanner(System.in);
			String string = scanner.next("输入执行命令");
			for (int i = 0; i < nodeList.getLength(); i++) {
				Element element = (Element) nodeList.item(i);
				if(string.equals(element.getTextContent())) {
					String method = element.getAttribute("method");
					String clazz = element.getAttribute("class");
					run(clazz,method);
				}
			}
	}

	private static void run(String clazz,String method) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		Class<?> clz = Class.forName(clazz);
		System.out.println(clazz);
		Object object = clz.getConstructor().newInstance();
		Method me = clz.getMethod(method);
		me.invoke(object);
	}	

}
