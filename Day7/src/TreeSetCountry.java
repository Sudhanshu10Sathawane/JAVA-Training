import java.util.*;
class CountryT{
	TreeSet<String> h=new TreeSet<>();
	public TreeSet<String> saveCountryNames(String CountryName) {
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
public class TreeSetCountry {

	public static void main(String[] args) {
		CountryT countries = new CountryT();
		countries.saveCountryNames("India");
		countries.saveCountryNames("USA");
		countries.saveCountryNames("Israel");
		countries.saveCountryNames("Bangladesh");
		countries.saveCountryNames("France");

		System.out.println("China: " + countries.getCountry("Israel"));
		System.out.println("Japan: " + countries.getCountry("Japan"));		
	}

}