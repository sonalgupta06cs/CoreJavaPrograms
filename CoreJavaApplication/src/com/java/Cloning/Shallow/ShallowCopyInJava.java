package com.java.Cloning.Shallow;

class Course1
{
    String subject1;
 
    String subject2;
 
    String subject3;
 
    public Course1(String sub1, String sub2, String sub3)
    {
        this.subject1 = sub1;
 
        this.subject2 = sub2;
 
        this.subject3 = sub3;
    }
}
 
class Student implements Cloneable
{
    int id;
 
    String name;
 
    Course1 course1;
 
    public Student(int id, String name, Course1 course1)
    {
        this.id = id;
 
        this.name = name;
 
        this.course1 = course1;
    }
 
    //Default version of clone() method. It creates shallow copy of an object.
 
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
 
public class ShallowCopyInJava
{
    public static void main(String[] args)
    {
        Course1 science = new Course1("Physics", "Chemistry", "Biology");
 
        Student student1 = new Student(111, "John", science);
 
        Student student2 = null;
 
        try
        {
            //Creating a clone of student1 and assigning it to student2
 
            student2 = (Student) student1.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
 
        //Printing the subject3 of 'student1'
 
        System.out.println(student1.course1.subject3);         //Output : Biology
 
        //Changing the subject3 of 'student2'
 
        student2.course1.subject3 = "Maths";
 
        //This change will be reflected in original student 'student1'
 
        System.out.println(student1.course1.subject3);       //Output : Maths
    }
}
/*
 * In the above example, �student1� is an object of �Student� class which has
 * three fields � id, name and course. �course� is a reference variable pointing
 * to a �Course� type object. Clone of �student1� is created by calling clone
 * method on it and assigned it to �student2�. As default version of clone
 * method creates the shallow copy, the �course� field of both �student1� and
 * �student2� will be pointing to same �Course� object. So, any changes made to
 * this object through �student2� will be reflected in �student1� or vice-versa.
 */