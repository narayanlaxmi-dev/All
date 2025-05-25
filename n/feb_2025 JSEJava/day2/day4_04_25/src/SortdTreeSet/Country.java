package SortdTreeSet;

public class Country implements Comparable<Country> {
	private int code;
	private String CountryName;
	private long population;

	public Country() {
		code = 0;
		CountryName = "un-known";
		population = 0;
	}

	public Country(int code, String CountryName, long population) {
		this.code = code;
		this.CountryName = CountryName;
		this.population = population;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public void setCountryName(String CountryName) {
		this.CountryName = CountryName;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public int getCode() {
		return code;
	}

	public long getPopulation() {
		return population;
	}

	public String getCountryName() {
		return CountryName;
	}

	@Override
	public String toString() {
		return "CountryName [code=" + code + ", CountryName=" + CountryName + ", population=" + population + "]";
	}

	@Override
	public int compareTo(Country country2) {
//		this method is used to provide default sorting algorithm 6 way by default 1 way picked
		// name wise assending default algo my developer
		String fName = CountryName; // String fName = this.countryName
		String SName = country2.CountryName;
		int comparevalue = fName.compareTo(SName);// SName.compareTo(FName); //<- this decending

		return comparevalue;
	}

}
