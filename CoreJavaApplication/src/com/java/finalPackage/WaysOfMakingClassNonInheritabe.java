package com.java.finalPackage;

public class WaysOfMakingClassNonInheritabe {

	/* What are two methods to resist a class from inherited in java?
	 
	 * Officially,
	 a.)  the Java language provides the keyword 'final' that is supposed
	   to fulfill this task. Consider the following code sample:
	 
	 //FinalDemo.java 
	  * public final class FinalDemo {
	  
	 * } Let's make another class that is supposed to be inherited from the above
	 * class. The Java language provides the 'extends' keyword that enables a class
	 * to be inherited from an existing class.
	  
	 * //FinalDemo2.java public class FinalDemo2 extends FinalDemo {
	  
	 * }
	  
	 * After compiling the first class, if you compile the second class, the JDK
	 * compiler will complain and you will get following error message:
	  
	 * FinalDemo2.java:1: cannot inherit from final FinalDemo public class
	 * FinalDemo2 extends FinalDemo{} ^ 1 error You have stopped your first class
	 * from being inherited by another class
	  
	  
	 * The Unofficial Way 
	 b.) But, that's not the only way to stop your class from being
	 * inherited by some other class. Consider the following code where I declare
	 * the constructor as private, and I declare a static method that returns an
	 * object of the class:
	  
	   public class PrivateTest
	   { 
	      private PrivateTest()
	      {
	         System.out.println("Private Default Constructor"); 
	      } 
	      public static PrivateTest getInstance()
	      { 
	         return new PrivateTest(); 
	      }
	  
	   }
	   A modified form of the above code is also known as the "Singleton Pattern,"
	 * where the getInstance method always returns only one instance of the class.
	 * But why does this code stop this class from being inherited? Consider the
	 * following code that is supposed to be inherited from the above class:
	  
	   public class PrivateTest2 extends PrivateTest
	   {
	  
	   }
	   
	   After compiling the first class, if you compile the second class, the JDK
	 * compiler will complain and you will get the following error message:
	  
	 * PrivateTest2.java:1: PrivateTest() has private access in PrivateTest 
	   public class PrivateTest2 extends PrivateTest{
       ^ 1 error The second class is unable to inherit the first class.
       But what does this error mean? 
       The Java language makes it compulsory to provide at least one 
       constructor in your class. If you do not provide any constructor 
       in your class, the JDK compiler will insert the so-called default
       constructor in your class; in other words, that constructor with no arguments, 
       with an empty body, and with a public access modifier.
       But if you define a constructor by yourself, the JDK compiler will
	 * not insert a default constructor for you. 
	 * What we did in class PrivateTest was that we declared the default constructor, but we changed the access
	 * modifier to private, which is legal by the rules of JDK compiler.
	  
	 * Now comes the second part. The Java language also makes it compulsory that
	 * you put the call to the super class constructor as the first call in your
	 * constructor. This is necessary to enable the inheritance features. We achieve
	 * this functionality by calling the appropriate super() method in Java, that
	 * should map to appropriate super class constructor. If you do not provide a
	 * default constructor, than JDK compiler will insert a default super
	 * constructor call in your constructor.
	  
	 * What I did in the first class that I make the constructor private. Now, when
	 * I inherit that class in the other class, the compiler tries to put in the
	 * default super constructor call. Because the scope of the super class
	 * constructor is set to private, the compiler complains that it is unable to
	 * call the super constructor. Hence, we stopped a class being inherited by some
	 * other class, the unofficial way.
 
     c.) Enum can not extend any class in java, the reason is by default, 
         Enum extends abstract base class java.lang.Enum. Since java does not 
         support multiple inheritance for classes, Enum can not extend another class.
         
         enum A {a,b,c}

		 enum B extends A {d}
			
		 B is {a,b,c,d}  -- > Not possible in java but using interface its possible
     
     d.) Make all member elements and methods private 
     ( Same as above, No object inheritance but static elements will be carried to derived class )
        
     e.) Make every method final, so people can't override them
     f.) Use a runtime check in the class constructor:

		if (this.getClass() != MyClass.class) {
		    throw new RuntimeException("Subclasses not allowed");
		}

	 */

}
