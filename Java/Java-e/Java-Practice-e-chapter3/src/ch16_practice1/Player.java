package ch16_practice1;

public class Player {
	
	private PlayerLevel level;

	// 초급자
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}

	public PlayerLevel getLevel() {
		return level;
	}

	// 초급자 이상
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}

	public void play(int count) {
		level.go(count);
	}






}
