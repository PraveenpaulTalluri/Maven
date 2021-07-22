package com.mavenpractice.sampleproject;

import javax.xml.transform.*;
import javax.xml.transform.stream.*;
import java.io.*;
public class XSLTransformation {
	public static void main(String[] args) throws TransformerConfigurationException {
		String xslFile="C://Users//praveen_t//git//MavenRepository//sampleproject//Fruits.xsl";
		String inputFile="C://Users//praveen_t//git//MavenRepository//sampleproject//Fruits.xml";
		String outputFile="C://Users//praveen_t//git//MavenRepository//sampleproject//FruitsOutput.xml";
		
		StreamSource xslcode= new StreamSource(new File(xslFile));
		StreamSource input= new StreamSource(new File(inputFile));
		StreamResult output= new StreamResult(new File(outputFile));
		
		
		TransformerFactory tf=TransformerFactory.newInstance();
		Transformer trans=tf.newTransformer(xslcode);
		
		try
		{
			trans.transform(input, output);
		} 
		catch (TransformerException e)
		{
			
			System.out.println("e");
		}
	}

}
