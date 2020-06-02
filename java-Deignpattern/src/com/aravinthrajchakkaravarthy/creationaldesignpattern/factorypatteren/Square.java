package com.aravinthrajchakkaravarthy.creationaldesignpattern.factorypatteren;

public class Square extends AreaOfShapes{

	
	public Square() {
		System.out.println("I am in Square");
	}

	@Override
	void printAreaFormulae() {
		System.out.println("Area of square is (a)2");
	}

}
