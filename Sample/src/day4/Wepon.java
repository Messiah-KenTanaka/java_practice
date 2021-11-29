package day4;

public abstract class Wepon {

	private String name = "";
	
	// コンストラクタ
	public Wepon(String name) {
		this.name = name;
	}
	// ゲッター
	public String getName() {
		return this.name;
	}
	// 攻撃メソッド
	public abstract void attack();
}
