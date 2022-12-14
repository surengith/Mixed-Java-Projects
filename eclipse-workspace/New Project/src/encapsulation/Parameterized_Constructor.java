package encapsulation;

public class Parameterized_Constructor {

	char initial;
	String Name, City;
	int Age;

	Parameterized_Constructor(char a, String b, String c, int d) {
		initial = a;
		Name = b;
		City = c;
		Age = d;
	}

	public static void main(String[] args) {
		Parameterized_Constructor obj = new Parameterized_Constructor('P', "Surendhar", "Erode", 15);
		System.out.println(obj.initial);
		System.out.println(obj.Name);
		System.out.println(obj.City);
		System.out.println(obj.Age);

		Parameterized_Constructor obj1 = new Parameterized_Constructor('P', "Karthi", "Erode", 15);
		System.out.println(obj1.initial);
		System.out.println(obj1.Name);
		System.out.println(obj1.City);
		System.out.println(obj1.Age);

		Parameterized_Constructor obj2 = new Parameterized_Constructor('P', "Suresh", "Erode", 15);
		System.out.println(obj2.initial);
		System.out.println(obj2.Name);
		System.out.println(obj2.City);
		System.out.println(obj2.Age);

		Parameterized_Constructor obj3 = new Parameterized_Constructor('P', "Dinesh", "Erode", 15);
		System.out.println(obj3.initial);
		System.out.println(obj3.Name);
		System.out.println(obj3.City);
		System.out.println(obj3.Age);
	}

}
