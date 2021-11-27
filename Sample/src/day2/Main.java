package day2;

public class Main {

	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println(c1.toString());
		System.out.println(c1.getClass());
		
		Object o = (Object)c1;
		System.out.println(o.toString());
	}

}
