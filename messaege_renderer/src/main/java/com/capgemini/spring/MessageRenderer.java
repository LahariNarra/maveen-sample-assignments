package com.capgemini.spring.renderer;

import com.capgemini.spring.provider.MessageProvider;

public class MessageRenderer{
	
	private MessageProvider messageProvider;
	
	//For Constructor Injection
	public MessageRenderer(MessageProvider messageProvider)
	{	
		this.messageProvider = messageProvider;
	}

	/*For Setter Injection
	public void setMessageProvider(MessageProvider messageProvider) 
	{	
		this.messageProvider = messageProvider;
	}*/

	public void render(){
		messageProvider.getMessage();	

	}
}