package ch21;

public class ObjectCopyTest {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];

		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
		// 얕은 복사처럼 동일한 변경이 싫을 때, 객체 배열이 서로 다른 객체를 가리키도록 함 => 깊은 복사
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();
		
		for(int i=0; i<library.length; i++) {
			copyLibrary[i].setAuthor(library[i].getAuthor());
			copyLibrary[i].setTitle(library[i].getTitle());
		}
		
		library[0].setAuthor("박완서");
		library[0].setTitle("나무");
		
		System.out.println("== 박완서library =="); 
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
		
		System.out.println("== 박완서copy library ==");
		for(Book book : copyLibrary) {
			System.out.println(book);
			book.showInfo();
		}
		
		
	/*
		System.arraycopy(library, 0, copyLibrary, 0, 5); // 객체 배열 복사하기
		
		System.out.println("== library ==");
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
		
		// 주소까지 동일하게 복사 됨
		System.out.println("== copy library ==");
		for(Book book : copyLibrary) {
			System.out.println(book);
			book.showInfo();
		}
		
		
		// 값 변경 시, 복사된 객체 배열까지 동일하게 변경 됨 => 얕은 복사
		library[0].setAuthor("박완서");
		library[0].setTitle("나무");
		
		System.out.println("== 박완서library =="); 
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
		
		System.out.println("== 박완서copy library ==");
		for(Book book : copyLibrary) {
			System.out.println(book);
			book.showInfo();
		}*/
			
	}

}
