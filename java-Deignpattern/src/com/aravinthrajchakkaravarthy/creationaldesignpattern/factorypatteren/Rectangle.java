package com.aravinthrajchakkaravarthy.creationaldesignpattern.factorypatteren;

public class Rectangle extends AreaOfShapes{

	public Rectangle() {
		System.out.println("I am in Rectangle");
	}

	@Override
	void printAreaFormulae() {
	System.out.println("Area of Rectangle is l * b ");
	}

}
