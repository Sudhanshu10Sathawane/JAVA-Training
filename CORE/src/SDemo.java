
public class SDemo {

 public static void main(String[] args) {

 String s="hello";

 System.out.println(s.charAt(2));

 System.out.println(s.toUpperCase());

 System.out.println(s.startsWith("h"));

 System.out.println(s.endsWith("o"));
 
 System.out.println(s.substring(2));
 
 String s1="hello how are you";

 System.out.println(s1.substring(6));

 System.out.println(s1.substring(6, 9));

 System.out.println(s1.indexOf('o'));

 System.out.println(s.lastIndexOf('o'));

 char a[]=s1.toCharArray();

 for(int i=0;i<a.length;i++)

 {

  System.out.print(a[i]);

 }

 System.out.println();

 for(char ch: a)

 {

  System.out.print(ch);

 }

 byte b[]=s.getBytes();

 for(byte x:b)

 {

 System.out.print((char)x);

 }
 }

}





