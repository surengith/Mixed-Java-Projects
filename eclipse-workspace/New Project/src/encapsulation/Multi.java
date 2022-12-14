package encapsulation;

public class Multi implements Abstraction, AbstractionMultiple {

	@Override
	public void Day() {
		System.out.println("Sunday");
	}

	@Override
	public void Time() {
		System.out.println("5 o'clock");
	}

	@Override
	public void Year() {
		System.out.println("2022");
	}

	@Override
	public void name() {
		System.out.println("Surendhar");
	}

	@Override
	public void city() {
		System.out.println("Erode");
	}

	@Override
	public void district() {
		System.out.println("Erode");
	}

	public static void main(String[] args) {

		Multi obj = new Multi();
		obj.Day();
		obj.Time();
		obj.Year();
		obj.name();
		obj.city();
		obj.district();

	}

}
