package com.springtest;

public class Tiger {

	private String name;
	private int Age;
	private Food food;
	
	public Tiger(){ 
	}
	
	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return Age;
	}
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
