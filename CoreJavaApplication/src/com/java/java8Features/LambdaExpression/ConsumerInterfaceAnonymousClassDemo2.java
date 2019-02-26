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
public class ConsumerInterfaceAnonymousClassDemo2 {

	public static void main(String[] args) {

		List<Integer> intList = Arrays.asList(1, 2, 6, 7);

		//Consumer<Integer> consumerImpl = new ConsumerImpl1();
		
		// It shows parameter to forEach() is an object of Consumer Interface.
		// How it works?
		// forEach() will get and pass all the 4 values one by one to the object and
		// hence, it
		// fetches first value from the list which is 1, and then send
		// it to accept method, which then prints it

		// The above ConsumerImpl is being used only once for implementation of
		// interface method, lets comment that and writer anonymous class for it.
		
		Consumer<Integer> consumerImpl = new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		};
		
		intList.forEach(consumerImpl);
		
		//consumerImpl.accept(9);
	}

}
