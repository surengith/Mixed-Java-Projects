package encapsulation;

public class MethodOverriding extends Methodoverloading {
	
	

	@Override
	public void name(int a) {
		// TODO Auto-generated method stub
		super.name(a);
		System.out.println("Chappel");
	}

	@Override
	public void name(int a, int b) {
		// TODO Auto-generated method stub
		super.name(a, b);
		System.out.println("Hello");
	}

	public static void main(String[] args) {
	
		MethodOverriding obj =new MethodOverriding();
		obj.name(50);
		obj.name(23, 54);

	}

}
