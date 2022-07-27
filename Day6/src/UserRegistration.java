import java.util.*;
class InvalidCountryException  extends Exception  
	{  
	    public InvalidCountryException (String str)  
	    {  
	        super(str);  
	    }  
	}  
public class UserRegistration {
	String username,userCountry;
	void registerUser(String username,String userCountry) {
		this.username=username;
		this.userCountry=userCountry;
	}
	static void validate (String userCountry) 
			throws InvalidCountryException{    
	       if(userCountry.equalsIgnoreCase("India")){   
	        System.out.println("Registration Successful");
	    }  
	       else {  
	    	   throw new InvalidCountryException("User Outside India cannot be registered"); 
	       }
	     } 
	public static void main(String[] args) {
		UserRegistration S1= new UserRegistration();
		UserRegistration S2= new UserRegistration();
		try {
		S1.registerUser("Hum","India");
		validate(S1.userCountry);
		S2.registerUser("Tum","USA");
		validate(S2.userCountry);
		}
		catch(InvalidCountryException ice) {
			System.out.println(ice.toString());
		}
	}

}
