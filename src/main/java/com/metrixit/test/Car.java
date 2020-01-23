package com.metrixit.test;

public class Car {
/*
	This class is used to explain
	Java class and object relationship
*/	
	public static final int wiperSpeed; //Class variable
	private String model; //Instance variable with access modifier private.
	private String make;
	String defaultInstanceVariable; //Default access modifier
	protected String protectedInstanceVariable;
	
	static {
		wiperSpeed = 10;
	}
	
	
	public Car() { //Constructor 1
		System.out.println("Car constructor 1 called");
		
	}
	
	public Car(String make, String model) { //Constructor 2
		System.out.println("Car constructor 2 called");
		this.make = make;
		this.model = model;
		
	}
	public void drive() {
		int diverSpeed = 10; //Local Variable. It needs to be assigned a value for it to be used.
		final int breakTorque; //Constant. It can assigned a value only once.
		
		byte localByteVariableMaxValue = 127; // default value is 0 -128 to 127
		breakTorque = 20;
		System.out.println("Drive method called for "+make+ " " +model);
		System.out.println("Break torque is "+breakTorque);
		System.out.println("Driver speed is "+diverSpeed);
		System.out.println("Byte variable "+localByteVariableMaxValue);
	}
	
	public static void main(String[] args) {
		Car toyotaHighlander = new Car("Toyota", "Highlander");
		//toyotaHighlander.make = "Mazda";
		//toyotaHighlander.model = "Highlander";
		toyotaHighlander.drive();	
	}
}
