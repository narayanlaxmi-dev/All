package Lession18_;

public class Var_18LoopWhile3 {

	public static void main( String[] args) {
		
		int i = 10;
		
		while(i < 20 & i < 16) { // 1 condition is smaller than 20 & 2 condition i <16 after 16=16 false 
			System.out.println(i);
			i++;// if you not use i++; you go INFINITE loop
		}
	}

}

