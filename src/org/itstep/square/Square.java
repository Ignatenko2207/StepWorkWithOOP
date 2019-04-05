package org.itstep.square;

import org.itstep.AbstractShape;

public class Square extends AbstractShape{

	private double side;

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public Square(double side) {
		this.side = side;
	}

	public Square() {
	}

	@Override
	public double getArea() {
		return side*side;
	}
}
