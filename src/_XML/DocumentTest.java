package _XML;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class DocumentTest {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, TransformerException {
		// TODO Auto-generated method stub
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse("/Users/Hzl/Desktop/students.xml");
		Element root = document.getDocumentElement();
		NodeList nodeList = root.getElementsByTagName("student");
		Element item = (Element)nodeList.item(1);
		String sid = item.getAttribute("sid");
		String cla = item.getAttribute("class");
		String textContent = item.getTextContent();
		System.out.println("sid:"+sid+",class:"+cla+",textContent:"+textContent);
		item.setAttribute("sid", "201902001");
		for (int i = 0; i < 20; i++) {
			Element createElement = document.createElement("student");
//			System.out.println(createElement.getNodeName());
//			System.out.println(createElement.getNamespaceURI()); null
//			document.renameNode(n, namespaceURI, qualifiedName)
			createElement.setAttribute(sid, Integer.toString(i));//属性名不能以数字开头
			createElement.setTextContent(Integer.toString(i));
			root.appendChild(createElement);
//			root.insertBefore(newChild, refChild)
			//root.removeChild(item);
		}
		
		TransformerFactory factory2 = TransformerFactory.newInstance();
		Transformer newTransformer = factory2.newTransformer();
		newTransformer.transform(new DOMSource(document), new StreamResult("/Users/Hzl/Desktop/students.xml"));
		
	}

}
