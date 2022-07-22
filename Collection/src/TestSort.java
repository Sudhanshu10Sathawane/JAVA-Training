class Student implements Comparable<Student>

{

int rollno;

String name;

int age;

Student(int rollno,String name,int age){

this.rollno=rollno;

this.name=name;

this.age=age;

}

public int compareTo(Student o) {

 if(age==o.age)

 return 0;

 else if (age>o.age)

 return 10;

 else
 return -22;

}

}  




