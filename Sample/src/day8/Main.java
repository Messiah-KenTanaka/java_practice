package day8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {
		
		PrintWriter pw =  null;
		try {
			pw = new PrintWriter(new BufferedWriter(new FileWriter("text4.txt")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		pw.print("printによる出力(改行なし)");
		pw.println("printlnによる出力（改行あり）");
		pw.printf("printfによる出力 %s", 5);
		System.out.println("data iyi");
		
		pw.close();
	}
}
