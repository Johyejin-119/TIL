package ch16_practice1;

public class MainBoardPlay {

	public static void main(String[] args) {

		Player player = new Player();
		player.play(1);
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
		
		UltraSuperLevel ulevel = new UltraSuperLevel();
		player.upgradeLevel(ulevel);
		player.play(4);
		ulevel.reset();
	}

}
