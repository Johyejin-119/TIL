package ch17;

public class Employee {
	
	private static int serialNum = 1000; // static 변수
	
	private int employeeId;
	private String employeeName;
	private String department;
	
	public Employee() { // 생성자
		
		serialNum++; // 사원 한명이 생길때마다 count
		employeeId = serialNum; // 각각의 사원들은 각기 다른 serialNum을 사원id로 부여받게 됨 
		
	}
	
	// 외부에서 값 변경하면 안되기 때문에 serialNum의 setter은 삭제
	// static 메소드(=클래스 메소드)
	public static int getSerialNum() {
		// int i = 0; // 안에 지역변수를 선언하는 것은 문제X
		// employName = "Lee"; // static 메소드에서 인스턴스변수(일반멤버변수)를 사용하는 것은 문제O
		return serialNum; // static 변수
		
	}
	
	public int getEmployeeId() {
		serialNum = 1000; // 일반 메소드에서 static 변수를 사용하는 것은 문제X. serialNum가 로드될 때 이미 메모리가 있기 때문
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}
