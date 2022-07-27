import java.util.*;
class InvalidMarksException  extends Exception  
{  
    public InvalidMarksException (String str)  
    {  
        super(str);  
    }  
}  
public class Student {
	static int validate (int marks) throws InvalidMarksException{    
	       if(marks < 0 || marks> 100){  
	  
	        // throw an object of user defined exception  
	        throw new InvalidMarksException("Mark is not valid"); 
	    }  
	       else {  
	    	   return marks;
	       }
	     }   
		String name;
		int sub1,sub2,sub3;
	public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getSub1() {
			return sub1;
		}

		public void setSub1(int sub1) {
			this.sub1 = sub1;
		}

		public int getSub2() {
			return sub2;
		}

		public void setSub2(int sub2) {
			this.sub2 = sub2;
		}

		public int getSub3() {
			return sub3;
		}

		public void setSub3(int sub3) {
			this.sub3 = sub3;
		}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student S1=new Student();
		Student S2=new Student();
		try { 
			S1.setName(sc.next());
			S1.setSub1(validate(sc.nextInt()));
			S1.setSub2(validate(sc.nextInt()));
			S1.setSub3(validate(sc.nextInt()));
			S2.setName(sc.next());
			S2.setSub1(validate(sc.nextInt()));
			S2.setSub2(validate(sc.nextInt()));
			S2.setSub3(validate(sc.nextInt()));
			System.out.print(S1.getName());
			System.out.print(" "+S1.getSub1());
			System.out.print(" "+S1.getSub2());
			System.out.println(" "+S1.getSub3());
			System.out.print(S2.getName());
			System.out.print(" "+S2.getSub1());
			System.out.print(" "+S2.getSub2());
			System.out.print(" "+S2.getSub3());
		}
		catch(NumberFormatException nfe) {
			System.out.println(nfe.toString());
		}
		catch (InvalidMarksException ex)  
        {  
            System.out.println(ex.toString()); 
        }  

	}

}
