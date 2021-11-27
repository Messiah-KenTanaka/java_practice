package day2;

public class Ambuiance extends Car{
	private int number = 119;
	
	public Ambuiance() {
		System.out.println("Aオブジェクト生成");
	}
	
	public void savePeople() {
		System.out.println("緊急車両:" + number);
	}
}
