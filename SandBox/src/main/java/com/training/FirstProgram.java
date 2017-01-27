package com.training;

public class FirstProgram {

	public static void main(String[] args){
		System.out.println("Hello,World!");
		hello("Mike");

//create class and object
        Square s=new Square(6);

		System.out.println("Area of the cube with the side of  "+s.len+ " = " + s.area());

//Create class and object. YOu can

		Rectangle r=new Rectangle(5,6);

		System.out.println("Area of the cube with the sides of  "+ r.a + " and " + r.b +  " = " + r.area());

	}


	public static void hello (String somebody){
		System.out.println("Hello " +somebody+" !");
	}



}

