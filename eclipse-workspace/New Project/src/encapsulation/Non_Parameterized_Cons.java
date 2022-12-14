package encapsulation;

public class Non_Parameterized_Cons {

	String a;
	char b;
	double c;

	Non_Parameterized_Cons() {

		a = "Surnedhar";
		b = 'P';
		c = 500.505;

	}

	public static void main(String[] args) {
		Non_Parameterized_Cons obj = new Non_Parameterized_Cons();

		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
	}

}
