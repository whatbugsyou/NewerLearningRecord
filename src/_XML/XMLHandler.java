package _XML;


import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XMLHandler extends DefaultHandler{
	
	private List<User> users;//维护解析得到的user组
    private String currentTag; // 记录当前解析到的节点名称，用于characters
    private User user; // 记录当前的user
	@Override
	/**
	 * XML解析器，所有浏览器都有内建都解析器。同样的标签，内部有不同的结构。schema dtd限制结构。通过命名空间xmlns:xx="xx/xx/schema/xx"
	 * 
	 * uri：xml文档的命名空间
		localName：标签的名字
		qName：带命名空间的标签的名字
		attributes：标签的属性集
	 */
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		
		super.startElement(uri, localName, qName, attributes);
		//开始解析一个标签头，判断标签内容
		
		//标签头的处理结束，保存标签名为characters做准备
		currentTag = localName;
	}
	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.startDocument();
		//开始解析，初始化维护集合
	}
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO Auto-generated method stub
		super.characters(ch, start, length);
		//遇到无法解析的标签，如字符
		//需要判断currentTag来确定上一个标签，即字符外头包的标签
	}
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		// TODO Auto-generated method stub
		super.endElement(uri, localName, qName);
		//结束标签，判断是否是User标签，是则存入集合,之后user置空
		
		//currentTag置为null
		currentTag=null;
	}
	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.endDocument();
		//文档解析完成
	}
	
	public List<User> getUsers() {
		return users;
	}
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		XMLHandler xmlHandler = new XMLHandler();
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser newSAXParser = factory.newSAXParser();
		newSAXParser.parse("xml文件",xmlHandler);
		
	}
}
