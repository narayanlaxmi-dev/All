package javaPackage;

public class Var_15Static_link14 {
	
	// now we have to call this Var_14Static_link15 class 
	public static void main(String[] args) {
		
		//create object from non-static Global var, you have to write under () in object 
		Var_14Static_link15 v14 = new Var_14Static_link15(1, "Narayana"); // (1,= roll && "Narayana" = name)
		Var_14Static_link15 v15 = new Var_14Static_link15(0, "Laxmi");
		Var_14Static_link15 v16 = new Var_14Static_link15(2, "Luffy, Zoro");
		Var_14Static_link15 v17 = new Var_14Static_link15(3, "yuyichi, ayanokoji");
		
		v14.getResult();
		v15.getResult();
		v16.getResult();
		v17.getResult();
	}

}
