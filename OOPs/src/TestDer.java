class TestBase //Single Level Inheritance

{

 TestBase()

 {

 System.out.println("base class constructor");

 }

 void m1()

 {

 System.out.println("m1 method");

 }

}

public class TestDer extends TestBase

{

  TestDer()

 {

 System.out.println("der class Constructor");

 }

 public static void main(String[] args)

 {

 System.out.println("before object creation");
 TestDer td=new TestDer();
 td.m1();

 }//main

}//class







