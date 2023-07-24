package ch16_practice1;

public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("jump는 못해!");
	}

	@Override
	public void turn() {
		System.out.println("turn은 못해!");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("=====초급자 레벨 BeginnerLevel=====");
	}

}
