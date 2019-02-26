package com.java.java8Features.LambdaExpression;

interface InterfacePrior {

	void display(int num);

}

// Implementation Class is just to implement the interface function, lets
// comment and use anonymous class
/*class Interface1Impl implements InterfacePrior {

	@Override
	public void display(int num) {

		System.out.println("Hello " + num);

	}

}*/

public class PriorToLambdaExpressionExam {

	public static void main(String[] args) {

		//uncomment to see Interface1Impl
		//Interface1 interface1Impl = new Interface1Impl();
		
		// Anonymous Class 
		InterfacePrior interface1Impl = new InterfacePrior() {
			
			public void display(int num) {
				
				System.out.println("Hello " + num);
			}
			
		};

		interface1Impl.display(10);
	}

}
