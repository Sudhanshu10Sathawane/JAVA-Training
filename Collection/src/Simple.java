import java.util.*;

class AgeComparator implements Comparator{

public int compare(Object o1,Object o2){

Student s1=(Student)o1;

Student s2=(Student)o2;

if(s1.age==s2.age)

return 0;

else if(s1.age>s2.age)

return 1;

else

return -1;

}

}  











import java.util.*;

class NameComparator implements Comparator{

public int compare(Object o1,Object o2){

Student s1=(Student)o1;

Student s2=(Student)o2;

return s1.name.compareTo(s2.name);

}

}











import java.util.*;

import java.io.*;

public class Simple{

public static void main(String args[]){

List <Student>al=new ArrayList<>();

al.add(new Student(101,"Vijay",23));

al.add(new Student(106,"Ajay",27));

al.add(new Student(105,"Jai",21));

System.out.println("Sorting by Name");

Collections.sort(al,new NameComparator());

Iterator <Student>itr=al.iterator();

while(itr.hasNext()){

Student st=itr.next();

System.out.println(st.rollno+" "+st.name+" "+st.age);

}

System.out.println("Sorting by age");

Collections.sort(al,new AgeComparator());

Iterator <Student>itr2=al.iterator();

while(itr2.hasNext()){

Student st=itr2.next();

System.out.println(st.rollno+" "+st.name+" "+st.age);

}

}

}  
