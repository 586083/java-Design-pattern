package com.aravinthrajchakkaravarthy.creationaldesignpattern.factorypatteren;

/**
 * Abstract Method which is used for create of object
 * 
 * */
public abstract class AreaOfShapes {
	
	abstract void printAreaFormulae(); 
	
	public AreaOfShapes() {
		System.out.println("In Area of Shapes");
	}

}
