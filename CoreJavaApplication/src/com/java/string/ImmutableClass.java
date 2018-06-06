package com.java.string;
// An immutable class
final class FinalImmutableClass
{
    final String name;
    final int regNo;
 
    public FinalImmutableClass(String name, int regNo)
    {
        this.name = name;
        this.regNo = regNo;
    }
    public String getName()
    {
        return name;
    }
    public int getRegNo()
    {
        return regNo;
    }
}
 
// Driver class
public class ImmutableClass
{
    public static void main(String args[])
    {
    	FinalImmutableClass s = new FinalImmutableClass("ABC", 101);
        System.out.println(s.name);
        System.out.println(s.regNo);
 
        // Uncommenting below line causes error
        // s.regNo = 102;
    }
}