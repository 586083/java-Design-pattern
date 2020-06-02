package com.aravinthrajchakkaravarthy.creationaldesignpattern.factorypatteren;

public class Cirlce extends AreaOfShapes {

	public Cirlce() {
		System.out.println("I am in Circle");
	}

	@Override
	void printAreaFormulae() {
		System.out.println("Area of circle is PI * (radius)2");
	}

}
