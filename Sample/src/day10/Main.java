package day10;

import java.util.Optional;

class Hoge {
	void foo() {
		System.out.println("foo");
	}
}

public class Main {

	public static void main(String[] args) {
		Optional<Hoge> h1 = Optional.ofNullable(getHoge1());
		h1.ifPresent(hoge -> hoge.foo());
		
		Optional<Hoge> h2 = Optional.ofNullable(getHoge2());
		h2.ifPresent(hoge -> hoge.foo());
	}
	
	public static Hoge getHoge1() {
		return new Hoge();
	}
	
	public static Hoge getHoge2() {
		return null;
	}
}
