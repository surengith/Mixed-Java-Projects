package encapsulation;

public class Methodoverloading {
	
	public void name(int a) {
		System.out.println("Footwears");
	}
	
	public void name(int a, int b) {
		System.out.println("outside");
	}

	public static void main(String[] args) {
		Methodoverloading obj= new Methodoverloading ();
		
		obj.name(20);
		obj.name(50, 60);	
		
	}
	
	}

