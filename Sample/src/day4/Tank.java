package day4;

public class Tank extends Wepon implements ICar, ICanon{

	public Tank() {
		super("戦車");
	}

	@Override
	public void fire() {
		System.out.println("砲撃");
	}

	@Override
	public void move() {
		System.out.println("移動");
	}

	@Override
	public void attack() {
		System.out.println(this.getName() + "の攻撃方法");
		System.out.println("------------");
		fire();
		move();
		System.out.println("-----------");
	}

}
