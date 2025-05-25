package rahulsirDay2;

import java.util.Scanner;

public class CurrencyMain {

	public static void main(String[] args) {
		
		CurrencyConverter.printMethod(); 
		System.out.println(" --- currency converter --- ");
		System.out.println(" Doller to rupee :" + CurrencyConverter.DOLLAR_TO_RUPEE);
		System.out.println(" Pound  to rupee :" + CurrencyConverter.POUND_TO_RUPEE);
		CurrencyConverter c;
		c = new Doller_To_RupeeConverter();

		int doller;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter doller :");
		doller = sc.nextInt();
		System.out.println(" $ Doller " + doller + " to rupees INR:- " + c.doConvert(doller));

		int pound = 500000;
		CurrencyConverter p = new Rupee_To_Pound();
		System.out.println("INR 5L  = GBP :-" + p.doConvert(pound));

		float aea = p.doConvert(500);
		System.out.println("fixed value 500 - " + aea);
		sc.close();
		
		System.out.println("---------------100 Euros to INR convert CurrencyConverter-----------");
		CurrencyConverter converter = new CurrencyConverter() { // anonymous class start
			
			@Override
			public float doConvert(float amounttoEuros) {
			float amountinRupee = amounttoEuros * 90.34f;
				return amountinRupee;
			}
		};
			float INR = converter.doConvert(100);
			System.out.println(" 100 Euro convert to INR :"+INR);

	}

}
