package ch09;

public class MyNoteBook extends NoteBook { // NoteBook에서 display()는 구현했기때문에 여기서는 typing()메소드만 구현하라고 자동 완성해줌

	@Override
	public void typing() {

		System.out.println("MyNoteBook typing");
	}

}
