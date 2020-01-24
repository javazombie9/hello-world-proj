package com.metrixit.execution;

import com.metrixit.shape.DrawShapeApplication;
import com.metrixit.shape.Rectangle;
import com.metrixit.test.Car;
import com.metrixit.test.Circle;
import com.metrixit.test.MyRectangle;

public class ProgramExecutor {

	public static void main(String[] args) {
		Car toyotaHighlander = new Car("Toyota", "Highlander");
		//toyotaHighlander.make = "Mazda";
		//toyotaHighlander.model = "Highlander";
		//toyotaHighlander.defaultInstanceVariable = "Test";
		//toyotaHighlander.protectedInstanceVariable = "";
		//toyotaHighlander.drive();	
		
		Rectangle rec = new MyRectangle();
		DrawShapeApplication drawShapeApplication = new DrawShapeApplication();
		drawShapeApplication.processShape(rec);
		
		Circle circle = new Circle();
		drawShapeApplication.processShape(circle);
		
	}
}
