package ch09;

public class ComputerTest {

	public static void main(String[] args) {

		Computer desktop = new Desktop();
		desktop.display();
		desktop.typing();
		desktop.turnOff(); // �������̵��Ǿ� Desktop���� turnOff()
		desktop.turnOn(); // Computer�� turnOn()
		
		NoteBook notebook = new MyNoteBook();
		notebook.display();
		notebook.typing();

	}

}
