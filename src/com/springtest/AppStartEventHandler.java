package com.springtest;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class AppStartEventHandler implements ApplicationListener<ContextStartedEvent> {

	@Override
	public void onApplicationEvent(ContextStartedEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("app start event has received");
	}
	
}