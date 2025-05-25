package rahulsirDay2;

public class Rupee_To_Pound implements CurrencyConverter {

	@Override
	public float doConvert(float amountinRupee) {
		float amountInPound = amountinRupee / POUND_TO_RUPEE; // rupee to pound divide
		float amountinrupee = amountInPound * POUND_TO_RUPEE; // rupee to pound multiply
		System.out.println("Pound to rupee INR:-" + amountinrupee);
		return amountInPound;
	}

}
