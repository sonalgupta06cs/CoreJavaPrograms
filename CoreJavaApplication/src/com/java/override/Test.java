package com.java.override;
class Base{
    // Static method in base class which will be hidden in subclass 
 public static void display() {
         System.out.println("Static or class method from Base");
 }
}
 
 // Subclass
class Derived extends Base {
 // This method hides display() in Base 
 public static void display() {
        System.out.println("Static or class method from Derived");
 }
} 
public class Test {
 public static void main(String args[ ])  {
      Base obj1 = new Derived();
 // As per overriding rules this should call to class Derive's static 
 // overridden method. Since static method can not be overridden, it 
 // calls Base's display() 
      obj1.display(); 
}
}