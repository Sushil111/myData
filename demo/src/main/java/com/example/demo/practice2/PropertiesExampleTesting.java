package com.example.demo.practice2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExampleTesting {
	public static void main(String[] args) throws IOException {
		Properties p=new Properties();
		//ClassLoader loader= Thread.currentThread().getContextClassLoader();		
		//FileInputStream fis=(FileInputStream) loader.getResourceAsStream("application.properties");
		//BufferedInputStream fis=(BufferedInputStream) loader.getResourceAsStream("application.properties");
		BufferedInputStream fis=new BufferedInputStream(new FileInputStream("src/main/resources/application.properties"));
		p.load(fis);
		System.out.println(p);
	//	String url=(String) p.get("url");
		//String password=p.getProperty("server.ssl.key-password");
		//String name=p.getProperty("spring.application.name");
		p.setProperty("Color", "Green");
		p.put("Coloe", "Green");
		BufferedOutputStream bufferedoutputStream=new BufferedOutputStream(new FileOutputStream("src/main/resources/application.properties"));
        p.store(bufferedoutputStream, "Updated properties file");		
		System.out.println(p);
		
	}

}

