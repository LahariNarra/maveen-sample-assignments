package com.capgemini.spring.provider;

public class GMorningMessageProvider implements MessageProvider{
	
	@Override
	public void getMessage(){
		System.out.println("Good Morning");
	}
}