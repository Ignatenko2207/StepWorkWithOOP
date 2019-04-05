package org.itstep;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.itstep.circle.Circle;
import org.itstep.square.Square;
import org.itstep.triangle.Triangle;

public class ApplicationRunner {
	
	private static Logger logger = Logger.getLogger(ApplicationRunner.class.getName());

	public static void main(String[] args) {
		Triangle triangle1 = new Triangle(15, 20);
		Triangle triangle2 = new Triangle(30, 10);

		Circle circle1 = new Circle(15);
		Circle circle2 = new Circle(25);
		
		Square square1= new Square(15);
		Square square2 = new Square(25);
		
		
		List<Shape> shapes = new ArrayList<>();
		shapes.add(square1);
		shapes.add(square2);
		shapes.add(triangle1);
		shapes.add(triangle2);
		shapes.add(circle1);
		shapes.add(circle2);
		
		logger.info("Shape with max area is " + getMaxShape(shapes).getClass().getSimpleName() + " and has area " + getMaxShape(shapes).getArea());
		
		
	}

	private static Shape getMaxShape(List<Shape> shapes) {
		Shape maxShape = shapes.get(0);
		
		for (Shape shape : shapes) {
			if (maxShape.getArea() < shape.getArea()) {
				maxShape = shape;
			}
		}
		
		return maxShape;
	}
}
