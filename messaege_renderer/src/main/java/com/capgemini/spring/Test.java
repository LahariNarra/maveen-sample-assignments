package com.capgemini.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;
import com.capgemini.spring.renderer.MessageRenderer;

public class Test{
	public static void main(String args[]){
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Working with test");
		MessageRenderer renderer = (MessageRenderer) context.getBean("ren");
		renderer.render();
	}
}