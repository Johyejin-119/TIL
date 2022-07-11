package ch18;

import java.util.Calendar;

import ch17.Employee;

public class CompanyTest {

	public static void main(String[] args) {
		// (Company에) 인스턴스를 생성해놓고 아래다가 가져다 쓰는 형태. static인 경우에는 클래스형태로 가져다 쓰기(아래처럼)
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
		
		// 100번을 출력해도 같은 결과
		System.out.println(company1);
		System.out.println(company2);
		
		// company는 외부에서 생성할 수 없고, 
		// 내부(Company.java)에서 private(6행)으로 하나 생성되어 있고, 
		// getInstance()로만 해당 private생성자를 사용할 수 있다.
		
		
		// Calendar calendar = new Calendar(); 마찬가지로 이렇게 이너클래스 형태로 만들게되면 오류, 클래스 형태로 만들기 
		Calendar calendar = Calendar.getInstance();
		// 유일한 객체를 제공할 때, 싱글톤 패턴을 사용한다.
	}

}
