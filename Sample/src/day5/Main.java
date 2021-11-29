package day5;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("abc");
		list.add("kgs");
		list.add("xzy");
		
		for(String s : list) {
			System.out.println(s);
		}
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		for(int i : list2) {
			System.out.println(i);
		}
	}

}
