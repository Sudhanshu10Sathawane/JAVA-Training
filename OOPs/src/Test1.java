interface First

{

 void red();

 void blue();

}

interface Second

{

 void pink();

}

interface Third extends First,Second

{

 public static final int i=9;

 public abstract void yellow();

}

public class Test1 implements Third

 {

 public void red()

 {

 System.out.println("this is red()");

 }

 public void blue()

 {

 System.out.println("this is blue()");

 }

 public void pink()

 {

 System.out.println("this is pink ");

 }

 public void yellow()

 {

 System.out.println("yellow method");

 }

 void xyz()

 {

 System.out.println("this is xyz()");

 }

 public static void main(String[] args)

 {

 Test1 t=new Test1();

 t.red();

 t.blue();

 t.xyz();

 t.pink();

 t.yellow();

 First f;

 f=new Test1();

 f.red();

 f.blue();

 //	f.xyz(); error

 //f.pink();

 Second s=t;

 s.pink();

 //s.red(); error

 // s.xyz() ; error

 Third th=new Test1();

 th.red();

 th.pink();

 th.yellow();

//	th.xyz();

 }

 }















