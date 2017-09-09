package org.apex.maven;

import java.util.Scanner;

public class CentiToInch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in); 
		System.out.println("Enter The Centimeters:"); 
		double centimeters = input.nextDouble();   
		double inches = Math.round( (centimeters / 2.54) * 100 ) / 100.0; 
		System.out.println(inches +" Inches");
		input.close();
	}
 
}

