package ch09;

// 제네릭 클래스가 아니더라도, 제니릭 메소드 사용 가능
public class GenericMethod {
 
	public static <T, V> double makeRectangle(Point<T, V> p1, Point<T, V> p2) {
		double left = ((Number)p1.getX()).doubleValue(); // double형으로 전부 변환
		double right = ((Number)p2.getX()).doubleValue();
		double top = ((Number)p1.getY()).doubleValue();
		double bottom = ((Number)p2.getY()).doubleValue();
		
		double width = right -left; // 너비
		double height = bottom - top; // 높이
		
		return width * height; // 면적
		
	}
	
	public static void main(String[] args) {
		
		Point<Integer, Double> p1 = new Point<Integer, Double>(0, 0.0); // (left, top)
		Point<Integer, Double> p2 = new Point<>(10, 10.0); // <Integer, Double> 생략 가능 // (right, bottom)
		
		// width = 10-0
		// height = 10.0-0.0
		// size = width * height = 10 * 10.0 = 100.0
		
		double size = GenericMethod.<Integer, Double>makeRectangle(p1,p2);
		System.out.println(size);
		
	}

}
