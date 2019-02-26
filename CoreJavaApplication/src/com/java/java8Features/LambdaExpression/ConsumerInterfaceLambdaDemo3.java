package com.java.java8Features.LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*
 * "Consumer" is an interface which is added in java.util.function package.
 *  Consumer<T> is an functional interface which has method accept()
 *  method, we can use lambda expression with functional interface.
 * */

/**
 * 
 * @author SonaSach
 *
 */
public class ConsumerInterfaceLambdaDemo3 {

	public static void main(String[] args) {

		List<Integer> intList = Arrays.asList(1, 2, 6, 7);
		
		// It shows parameter to forEach() is an object of Consumer Interface.
		
		//Consumer<Integer> consumerImpl = (Integer t) -> System.out.println(t);
		//intList.forEach(consumerImpl);
		
		// or
		
		intList.forEach( t -> System.out.println(t) ); // same as ForEachMethodExam.java

	}

}
