package com.springtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Tiger {

	private String name;
	private int Age;

	@Autowired(required=false)
	@Qualifier("food2")
	private Food food;
	
	public Tiger(){ 
	}
	
	public Food getFood() {
		return food;
	}

//	public void setFood(Food food) {
//		this.food = food;
//	}

	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return Age;
	}
	
	@Required
	public void setAge(int age) {
		Age = age;
	}
	
	public void haveLunch(){
	   System.out.println("today my lunch is:" + food.getName());	
	}
//	public String getFood() {
//		return food;
//	}
//	public void setFood(String food) {
//		this.food = food;
//	}
}
