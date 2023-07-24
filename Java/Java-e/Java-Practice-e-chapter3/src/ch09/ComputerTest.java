package ch09;

public class ComputerTest {

	public static void main(String[] args) {

		Computer desktop = new Desktop();
		desktop.display();
		desktop.typing();
		desktop.turnOff(); // 오버라이딩되어 Desktop에서 turnOff()
		desktop.turnOn(); // Computer의 turnOn()
		
		NoteBook notebook = new MyNoteBook();
		notebook.display();
		notebook.typing();

	}

}
