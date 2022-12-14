package encapsulation;

public class Variables {

	static int a = 50;

	public void mobile() {
		int a = 17;
		int b = 15;
		float c = 2.50f;
		double d = 50.3;
		char e = 'H';
		String f = "Surendhar";

		System.out.println(a + b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);

	}

	public static void main(String[] args) {

		Variables obj = new Variables();
		obj.mobile();
		System.out.println(a);
	}

}
