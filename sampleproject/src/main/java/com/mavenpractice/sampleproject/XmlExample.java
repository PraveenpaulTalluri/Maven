package com.mavenpractice.sampleproject;

import java.io.*;
import org.dom4j.*;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
public class XmlExample {
	 public static void main(String[] args) {
	      
	      try {
	         Document document = DocumentHelper.createDocument();
	         
	         Element root = document.addElement( "cars" );
	         Element supercarElement = root.addElement("supercars")
	            .addAttribute("company", "Bugati");

	         supercarElement.addElement("carname")
	            .addAttribute("type", "Formula one")
	            .addText("Bugati veron");

	         supercarElement.addElement("carname")
	            .addAttribute("type", "sports")
	            .addText("Bugati sport");

	        
	         OutputFormat format = OutputFormat.createPrettyPrint();
	         
	         File file=new File("C://Users//praveen_t//git//MavenRepository//sampleproject//example.XML");
	         XMLWriter writer = new XMLWriter(new FileOutputStream(file), format );
	         writer.write( document );
	         writer.close();
	         
	         System.out.println("Xml file generated");
	         
				/*
				 * XMLWriter writer1 = new XMLWriter(System.out, format ); writer1.write(
				 * document ); writer1.close();
				 */
	        
	      } catch (UnsupportedEncodingException e) {
	         System.out.println("XMl file not generated"+e);;
	      } catch (IOException e) {
	         System.out.println("XML file not generated"+e);;
	      }
	   }
}
