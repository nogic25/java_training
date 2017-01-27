package com.training;

public class FirstProgram {

	public static void main(String[] args){
		System.out.println("Hello,World!");
		hello("Mike");

		double l=6.0;
		System.out.println("Area of the cube with the side of  "+l+ " = " + area(l));
		double c=6.0;
		double d=5.0;
		System.out.println("Area of the cube with the sides of  "+ c + " and " + d +  " = " + area(c,d));

	}

	public static void hello (String somebody){
		System.out.println("Hello " +somebody+" !");
	}

	public static double area(double l){
		return l*l;
	}

	public static double area(double a, double b){
		return a*b;
	}

}

