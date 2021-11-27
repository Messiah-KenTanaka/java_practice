package day3;

public class Crow extends Bird{


	public Crow() {
		super("カラス");
	}

	@Override
	void sing() {
		System.out.println("カーカー");
	}

}
