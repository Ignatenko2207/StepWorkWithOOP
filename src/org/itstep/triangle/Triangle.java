package org.itstep.triangle;

import org.itstep.AbstractShape;

public class Triangle extends AbstractShape{

	private double base;
	private double heigth;

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeigth() {
		return heigth;
	}

	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}

	public Triangle(double base, double heigth) {
		this.base = base;
		this.heigth = heigth;
	}

	public Triangle() {
	}

	@Override
	public double getArea() {
		return base*heigth/2;
	}

}
