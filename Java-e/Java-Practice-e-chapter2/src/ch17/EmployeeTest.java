package ch17;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee employeeLee = new Employee(); 
		employeeLee.setEmployeeName("이순신"); 
		
		// System.out.println(Employee.serialNum); // private 으로 했기때문에 외부에서 참조하면 오류뜸
		System.out.println(Employee.getSerialNum()); // getSerialNum()으로 사용 가능
		

		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("김유신");
		
		// 2개의 인스턴스가 하나의 메모리를 공유한다.
		System.out.println(employeeLee.getEmployeeName() + "님의 사번은 " + employeeLee.getEmployeeId() + "입니다."); // 공유메모리에
		System.out.println(employeeKim.getEmployeeName() + "님의 사번은 " + employeeKim.getEmployeeId() + "입니다."); // 공유메모리에

	}

}
