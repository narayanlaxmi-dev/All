package assignment8.bank;

public abstract class Bank {
   protected static float minimumInterestRate=4.0f;
   
   //non- abstract method
   public void displayDetails() {
	   System.out.println("This Bank follows RBI Guidlines");
   }
   
   //abstract Method
   public abstract float getInterestRate();
}