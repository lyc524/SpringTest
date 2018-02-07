package com.springtest.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class CustomEventHandler implements ApplicationListener<CustomEvent>  {
	public void onApplicationEvent(CustomEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println(arg0.toString());
	}

}
