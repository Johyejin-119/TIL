package ch16;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee employeeLee = new Employee(); // employeeLee는 main안에 선언된 지역변수 -> 지역변수는 스택메모리에 생성
		employeeLee.setEmployeeName("이순신"); // 힙 메모리(동적메모리)에
		
		System.out.println(employeeLee.serialNum); // 공유메모리에 
		
		// 위 코드에서 노란줄 뜨는 이유? 클래스 변수로 참조해서 써라!
		// serialNum은 클래스 변수. 이미 메모리에 올라와있을 때 만들어졌기 때문에 인스턴스 생성여부와 상관없이 사용가능
		// System.out.println(Employee.serialNum); // 이렇게 클래스이름으로 참조해서 많이 사용함
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("김유신");
		
		// 2개의 인스턴스가 하나의 메모리를 공유한다.
		System.out.println(employeeLee.getEmployeeName() + "님의 사번은 " + employeeLee.getEmployeeId() + "입니다."); // 공유메모리에
		System.out.println(employeeKim.getEmployeeName() + "님의 사번은 " + employeeKim.getEmployeeId() + "입니다."); // 공유메모리에

	}

}
