package ch16_practice1;

public class Player {
	
	private PlayerLevel level;

	// �ʱ���
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}

	public PlayerLevel getLevel() {
		return level;
	}

	// �ʱ��� �̻�
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}

	public void play(int count) {
		level.go(count);
	}






}
