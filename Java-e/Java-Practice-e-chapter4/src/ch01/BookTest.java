package ch01;

// Object 클래스 toString() 사용
class Book {
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return title + "," + author;
	}
	
	
}


public class BookTest {

	public static void main(String[] args) {
		Book book = new Book("데미안", "헤르만 헤세");
		System.out.println(book);  //  위에 toString() 오바라이딩 메소드 없을 경우, ch01.Book@436e852b 출력 => @가상메모리값 16진수
		System.out.println(book);  //  데미안, 헤르만 헤세  =>  이미 toString()으로 오버라이딩(재정의)되어있음
		System.out.println(book.toString());  //  데미안, 헤르만 헤세 
		
		
		String str = new String("test");
		System.out.println(str); // test 출력  =>  이미 toString()으로 오버라이딩(재정의)되어있음
		System.out.println(str.toString()); // test 출력
	}

}
