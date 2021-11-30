package day9;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale jp = new Locale("ja", "JP");
		Locale us = new Locale("en", "US");
		Locale ch = new Locale("zh", "CN");
		
		System.out.println("日本のロケール" + jp.getDisplayLanguage() + "国名" + jp.getDisplayCountry());
	}
}
