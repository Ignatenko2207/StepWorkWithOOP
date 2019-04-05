package org.itstep.circle;

import org.itstep.AbstractShape;

public class Circle extends AbstractShape{

	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle() {
	}

	@Override
	public double getArea() {
		return Math.PI*radius*radius;
	}
}
