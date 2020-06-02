package com.aravinthrajchakkaravarthy.creationaldesignpattern.factorypatteren;

/**
 * @author aravinthrajchakkaravarthy
 * This class is an factory class to decide which class to be instantiated, based on client input
 */
public class GetAreaFormulae {
	
	public AreaOfShapes getAreaOfShapes(String shapeName) {
		if(shapeName != null)
		switch (shapeName) {
				case "CIRCLE":
					return new Cirlce();
				case "RECTANGLE":
					return new Rectangle();
				case "SQUARE":
					return new Square();
				default:
					return null;
			}
		return null;
	}
	
	

}
