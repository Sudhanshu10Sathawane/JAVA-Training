import java.util.*;
class Country{
	HashSet<String> h=new HashSet<>();
	public HashSet<String> saveCountryNames(String CountryName) {
		h.add(CountryName);
		return h;
	}
	public String getCountry(String CountryName) {
		Iterator<String> it = h.iterator();
		
		while (it.hasNext()) {
			if (it.next().equals(CountryName))
				return CountryName;
		}
		
		return null;
	}
	
	
}
public class ValidCountry {

	public static void main(String[] args) {
		Country countries = new Country();
		countries.saveCountryNames("India");
		countries.saveCountryNames("USA");
		countries.saveCountryNames("Israel");
		countries.saveCountryNames("Bangladesh");
		countries.saveCountryNames("France");
//		System.out.println(countries.getCountry());
		System.out.println("Israel: " + countries.getCountry("Israel"));
		System.out.println("Japan: " + countries.getCountry("Japan"));		
	}

}