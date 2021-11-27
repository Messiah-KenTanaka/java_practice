package day1;

public class SampleEx101 {

	public SampleEx101() {
		System.out.println("コンストラクタ");
	}
	
	public void foo() {
		System.out.println("インスタンスメソッド");
	}
	
	public static void bar() {
		System.out.println("静的メソッド");
	}
	
	public static void main(String[] args) {
		SampleEx101 s1 = new SampleEx101();
		
		s1.foo();
		
		bar();
		
		SampleEx101.bar();
	}

}
