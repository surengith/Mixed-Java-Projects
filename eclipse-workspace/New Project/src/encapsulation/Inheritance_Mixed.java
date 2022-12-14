package encapsulation;

public class Inheritance_Mixed extends Inheritance_Single_Extends {

	@Override
	public void name() {
		super.name();
		System.out.println("Myntra");
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

		Inheritance_Mixed ob = new Inheritance_Mixed();
		ob.name();
		ob.catageory();
		ob.Price();

	}

}
