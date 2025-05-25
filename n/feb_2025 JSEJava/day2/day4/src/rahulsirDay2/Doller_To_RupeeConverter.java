package rahulsirDay2;

public class Doller_To_RupeeConverter implements CurrencyConverter {

	@Override // notation for overridden code
	public float doConvert(float amountinDollars) {
		
		float amountInRupees = amountinDollars * DOLLAR_TO_RUPEE;

		return amountInRupees;
	}

}
