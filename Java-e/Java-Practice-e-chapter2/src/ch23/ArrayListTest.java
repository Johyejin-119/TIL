package ch23;

import java.util.ArrayList;

import ch21.Book;

public class ArrayListTest {

	public static void main(String[] args) {
		
		// <> 제너리? => 어떤 객체를 넣을건지 지정
		// 끝에 <Book>, <> 이렇게 생략가능
		ArrayList<Book> library = new ArrayList<>();
		
		// 요소(엘리먼트)를 딱히 지정안해주면, 기본적으로 10개 잡은 후에, 늘리고 줄이고 자동으로 변경해줌 
		library.add(new Book("태백산맥1", "조정래"));
		library.add(new Book("태백산맥2", "조정래"));
		library.add(new Book("태백산맥3", "조정래"));
		library.add(new Book("태백산맥4", "조정래"));
		library.add(new Book("태백산맥5", "조정래"));
	
		for(int i=0; i<library.size(); i++) {
			library.get(i).showInfo();
		}
	}
	

}
