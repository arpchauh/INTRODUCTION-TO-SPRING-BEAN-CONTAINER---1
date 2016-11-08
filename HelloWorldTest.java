package com.acadgild;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("HelloWorldConfig.xml");
		
		HelloWorld obj = (HelloWorld) context.getBean("HelloWorld");
		obj.getMessage();
	}

}
