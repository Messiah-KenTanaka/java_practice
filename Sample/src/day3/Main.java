package day3;

public class Main {

	public static void main(String[] args) {
		Bird b[] = new Bird[1];
		b[0] = new Crow();
		for(int i = 0; i < b.length; i++) {
			System.out.println(b[i].getName());
			b[i].sing();
		}
	}

}
