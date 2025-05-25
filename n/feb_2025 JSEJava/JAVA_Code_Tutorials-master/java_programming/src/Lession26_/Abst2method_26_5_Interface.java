package Lession26_;

import Lession22_.OOPS22_8_Inheritance;

//Interface2 , Abstraction using multiple inheritance 
public class Abst2method_26_5_Interface extends OOPS22_8_Inheritance implements Abst2method_26_3_Interface, Abst2method_26_4_Interface{


	public void hack() {
		System.out.println("H, is Fun");
	}


	public void milk() {
		System.out.println("M, is Loving");
	}


	public void anime() {
		System.err.println("luffy, zoro, kan kanaki, yuuichi, ayanokoji, eren, naruto, natsu, asta, alacard, tanjiro, deku, ippo, kai, ryuga");
	}


	public void garba() {
		System.out.println("love to dance, but....");
	}


	public void accessories() {
		System.out.println("accessories= fight,info,drift");
	}

	
	public void bike() {
		System.out.println("none - duke");
		
	}
	public static void main(String[] args) {
		
		//create obj/const for print
		Abst2method_26_5_Interface ab2 = new Abst2method_26_5_Interface();
		ab2.accessories();
		ab2.bike();
		ab2.garba();
		ab2.anime();
		ab2.driving();
		ab2.fighting();
		ab2.hack();
		ab2.hacking();
		ab2.milk();
		
		}

}
