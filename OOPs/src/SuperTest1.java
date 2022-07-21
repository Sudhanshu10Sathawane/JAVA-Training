// Example on super.member

class TestBase1

{

int a,b;

TestBase1()

 {

 System.out.println("Zero-args constructor base");

 }

 TestBase1(int x,int y)

 {

 a=x;

 b=y;

 System.out.println("param construcotr of base");

 }

 void disp()

 {

 System.out.println("base class "+a+" "+b);

 }

}

class TestDer1 extends TestBase1

{

 int c;

 int d;

TestDer1()

 {

 System.out.println("zero-arg con in der ");

 }

TestDer1(int x,int y,int z,int dx)

 {

 super(x,y);

 c=z;

 d=dx;

 System.out.println("param con -der class");

 }

 void disp()

 {

 super.disp();

 System.out.println("der class "+c+" "+d);

 }

}//class

public class SuperTest1

{

 public static void main(String args[])

 {

 TestDer1 d=new TestDer1(1,2,3,4);

 d.disp();

 }//main

}//class











