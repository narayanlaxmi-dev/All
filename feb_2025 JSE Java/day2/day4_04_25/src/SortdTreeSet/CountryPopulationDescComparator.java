package SortdTreeSet;

import java.util.Comparator;

public class CountryPopulationDescComparator implements Comparator<Country>{

	@Override
	public int compare(Country country1, Country country2) {
		Integer fPopul = (int) country1.getPopulation(); // outbox cast 
		Integer sPopul = (int) country2.getPopulation();
		int populationvalue = sPopul.compareTo(fPopul); // decending population wise compareTo is present in int  
		
		return populationvalue;
	}

}
