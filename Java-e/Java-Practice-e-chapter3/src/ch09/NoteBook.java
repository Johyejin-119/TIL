package ch09;

public abstract class NoteBook extends Computer { // typing() 메소드는 구현하지않고, NoteBook을 상속받게 되는 클래스에서 하게끔 만들자

	@Override
	public void display() {

		System.out.println("NoteBook display");
	}


}
