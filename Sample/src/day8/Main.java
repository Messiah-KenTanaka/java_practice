package day8;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		FileReader fr = null;
		try {
			fr = new FileReader("text1.txt");
			int c;
			while((c = fr.read()) != -1) {
				System.out.print((char)c);
			}
		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりません");
		} catch (IOException e2) {
			System.out.println("ファイルエラーです");
		} finally {
			try {
				if(fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				System.out.println("ファイルクローズに失敗しました。");
			}
		}
	}
}
