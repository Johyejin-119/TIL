package ch16_practice1;

public class UltraSuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("우사인볼트처럼 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("하늘 높이까지 jump 합니다.");
	}

	@Override
	public void turn() {
		System.out.println("무한 turn이 가능합니다.");
	}
	
	public void reset() {
		System.out.println("게임을 처음부터 다시 시작할 수 있는 카드가 있습니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("=====초고수 레벨 UltraSuperLevel=====");
	}

}
