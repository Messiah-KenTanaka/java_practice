package day4;

public class Main {

	public static void main(String[] args) {
		Tank t = new Tank();
		System.out.println(t.getName() + "武器の名前" + Tank.WEPON_NAME);
		System.out.println(t.getName() + "武器のタイプ" + Tank.TYPE_NEME);
		t.attack();
	}

}
