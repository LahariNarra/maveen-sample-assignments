package com.capgemini.spring.provider;

public class HelloMessageProvider implements MessageProvider{
	@Override
	public void getMessage(){
		System.out.println("Hello World");
	}
}