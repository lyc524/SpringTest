package com.springtest;

public class Animal {
	 
	private String name; 

	public String getName() {
		return name;
	} 
	public void setName(String name) {
		this.name = name;
	}


	public void init(){
		System.out.println("---init task---");
	}
	
	
	public void destroy() {
		System.out.println("---destroy task---");
	}
	
}
