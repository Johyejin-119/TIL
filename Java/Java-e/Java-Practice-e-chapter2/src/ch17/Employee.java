package ch17;

public class Employee {
	
	private static int serialNum = 1000; // static ����
	
	private int employeeId;
	private String employeeName;
	private String department;
	
	public Employee() { // ������
		
		serialNum++; // ��� �Ѹ��� ���涧���� count
		employeeId = serialNum; // ������ ������� ���� �ٸ� serialNum�� ���id�� �ο��ް� �� 
		
	}
	
	// �ܺο��� �� �����ϸ� �ȵǱ� ������ serialNum�� setter�� ����
	// static �޼ҵ�(=Ŭ���� �޼ҵ�)
	public static int getSerialNum() {
		// int i = 0; // �ȿ� ���������� �����ϴ� ���� ����X
		// employName = "Lee"; // static �޼ҵ忡�� �ν��Ͻ�����(�Ϲݸ������)�� ����ϴ� ���� ����O
		return serialNum; // static ����
		
	}
	
	public int getEmployeeId() {
		serialNum = 1000; // �Ϲ� �޼ҵ忡�� static ������ ����ϴ� ���� ����X. serialNum�� �ε�� �� �̹� �޸𸮰� �ֱ� ����
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
