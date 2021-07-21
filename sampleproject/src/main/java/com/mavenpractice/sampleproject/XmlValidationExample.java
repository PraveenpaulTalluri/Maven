package com.mavenpractice.sampleproject;

import java.io.File;
import java.io.IOException;
import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

public class XmlValidationExample {
	
	public static void xmlValidation(String xmlFile,String xsdFile) throws SAXException, IOException
	{
		 SchemaFactory sf= SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		 
		 ((sf.newSchema(new File(xsdFile))).newValidator()).validate(new StreamSource(new File(xmlFile)));
	}
	public static void main(String[] args) {
		
		try {
		xmlValidation("Customers.xml","Customers.xsd");
		System.out.println("Validation success");
		}
		catch(SAXException e) 
		{
			System.out.println("Validation failed");
			System.out.println(e);
		} 
		catch (IOException e) 
		{
			System.out.println("Validation failed");
			System.out.println(e);
		}
	}

}
