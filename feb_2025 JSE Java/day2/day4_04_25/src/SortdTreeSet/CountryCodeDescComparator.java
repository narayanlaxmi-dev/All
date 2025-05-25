package SortdTreeSet;

import java.util.Comparator;

public class CountryCodeDescComparator implements Comparator<Country>{

	@Override
	public int compare(Country country1, Country country2) {
		Integer fCode = country1.getCode(); // outbox cast 
		Integer sCode = country2.getCode();
		int codevalue = sCode.compareTo(fCode); // decending code wise compareTo is present in int  
		
		return codevalue;
	}

}
