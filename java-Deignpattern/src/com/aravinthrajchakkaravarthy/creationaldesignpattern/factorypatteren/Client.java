package com.aravinthrajchakkaravarthy.creationaldesignpattern.factorypatteren;

public class Client {

	public Client() {
		System.out.println("I am in Client");
	}

	public static void main(String args[]) {
		String shape="SQUARE";
		AreaOfShapes shapeObject=new GetAreaFormulae().getAreaOfShapes(shape);
		if(shapeObject != null) {
			shapeObject.printAreaFormulae();
		}else{
			System.out.println("Cannot predict Area");
		};
	}
}
