package _XML;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.xml.sax.SAXException;

public class DOM4JTest {

	public static void main(String[] args) throws DocumentException, SAXException, IOException {
		// TODO Auto-generated method stub
		SAXReader reader = new SAXReader();
		String xmlfile="/Users/Hzl/Desktop/students.xml";
		Document doc = reader.read(xmlfile);
		System.out.println(doc.getName());//得到路径！！！！
		System.out.println(doc.getNodeType());//9
		System.out.println(doc.getNodeTypeName());//Document
		System.out.println(doc.getPath());//  /  节点目录
		System.out.println(doc.getRootElement()); //students
		System.out.println(doc.getDocType());//null 
		System.out.println(doc.getDocument());//得到自己
		System.out.println("=============================================");
		Element rootElement = doc.getRootElement();
		Iterator<Element> iterator = rootElement.elementIterator();
		Element element = iterator.next();
		element.getText();//自己的text
		element.setText("text");
		element.elementText("name");//元素下面name元素的text内容
		List attributes = element.attributes(); //获得属性组
		List elements = element.elements();//子节点组
		element.attributeValue("sid");
		Attribute attribute = element.attribute("class");
		attribute.setValue("sda");
		attribute.getName();
		attribute.getValue();
		
		Iterator<Node> nodeIterator = doc.nodeIterator();
		Node node = nodeIterator.next();
		System.out.println(node.getPath());// /student
		System.out.println(node.getName());//student
		System.out.println(node.getNodeType());//1
		System.out.println(node.getNodeTypeName());//Element
		
		Document document = DocumentHelper.createDocument();
		Element root = document.addElement("String");
		root.addAttribute("ss", "ss1");
		//document.ele
		
		//
		OutputFormat xmlFormat = OutputFormat.createPrettyPrint();
		XMLWriter writer = new XMLWriter(new FileOutputStream(doc.getName()),new OutputFormat());
		writer.write(document);
	}

}
