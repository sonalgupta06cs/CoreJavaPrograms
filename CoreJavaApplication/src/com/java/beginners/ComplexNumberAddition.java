package com.java.beginners;

public class ComplexNumberAddition {
	
	// Complex Number  =>  2 + 5i   ,    4 + 3i    =     6 + 8i
	
	double real, imaginary;
	
	public ComplexNumberAddition(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public static ComplexNumberAddition sumComplexNumber(ComplexNumberAddition add1, ComplexNumberAddition add2) {
		
		ComplexNumberAddition temp = new ComplexNumberAddition(0, 0);
		temp.real = add1.real + add2.real;
		temp.imaginary = add1.imaginary + add2.imaginary;
		
		return temp;
	}

	public static void main(String[] args) {
		
		ComplexNumberAddition addition1 = new ComplexNumberAddition(2, 5);
		ComplexNumberAddition addition2 = new ComplexNumberAddition(4, 3);
		
		ComplexNumberAddition sumComplexNumber = sumComplexNumber(addition1, addition2);
		System.out.printf("Sum is: "+ sumComplexNumber.real+" + "+ sumComplexNumber.imaginary +"i");
	}

}
