package day7;

public class Main {

	public static void main(String[] args) {
	
		try {
			throw new SampleException("自作の例外サンプル");
		} catch (SampleException e) {
			e.printStackTrace();
		}
	}

}
