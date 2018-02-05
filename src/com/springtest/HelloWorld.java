package com.springtest;

public class HelloWorld  {
	 private String message;
	   public void setMessage(String message){
	      this.message  = message;
	   }
	   public void getMessage(){
	      System.out.println("Your Message 123: " + message);
	   }
	   
	   
	   public void init(){
		   System.out.println("starting init method...");
	   }
	   
	   
	   public void destroy(){
		      System.out.println("Bean will destroy now.");
		   } 
}
