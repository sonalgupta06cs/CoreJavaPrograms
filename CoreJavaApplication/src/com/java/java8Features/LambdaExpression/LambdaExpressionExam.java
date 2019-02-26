package com.java.java8Features.LambdaExpression;

@FunctionalInterface
interface InterfaceLambda {

	void display(int num);

}

public class LambdaExpressionExam {

	public static void main(String[] args) {

		// Using Lambda Expression -> , so whatever is written post "=" operator , is implementation
		// of some interface, hers is Interface1
		InterfaceLambda interface1Impl = (num) -> System.out.println("Hello " + num);
		interface1Impl.display(10);
	}

}
