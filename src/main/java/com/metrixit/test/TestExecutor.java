package com.metrixit.test;

public class TestExecutor {
	public static void main(String[] args) {
		Car toyotaHighlander = new Car("Toyota", "Highlander");
		//toyotaHighlander.make = "Mazda";
		//toyotaHighlander.model = "Highlander";
		toyotaHighlander.defaultInstanceVariable = "Test";
		toyotaHighlander.protectedInstanceVariable = "";
		toyotaHighlander.drive();	
	}
}
