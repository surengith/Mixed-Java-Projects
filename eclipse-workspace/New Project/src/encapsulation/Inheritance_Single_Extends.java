package encapsulation;

public class Inheritance_Single_Extends extends Inheritance_Single {

	@Override
	public void name() {
		super.name();
		System.out.println("Amazon");
	}

	@Override
	public void catageory() {
		super.catageory();
	}

	@Override
	public void Price() {
		super.Price();
	}

	public static void main(String[] args) {
		Inheritance_Single_Extends obj = new Inheritance_Single_Extends();
		obj.name();
		obj.catageory();
		obj.Price();

	}
}
