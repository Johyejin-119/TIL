package ch17;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee employeeLee = new Employee(); 
		employeeLee.setEmployeeName("�̼���"); 
		
		// System.out.println(Employee.serialNum); // private ���� �߱⶧���� �ܺο��� �����ϸ� ������
		System.out.println(Employee.getSerialNum()); // getSerialNum()���� ��� ����
		

		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("������");
		
		// 2���� �ν��Ͻ��� �ϳ��� �޸𸮸� �����Ѵ�.
		System.out.println(employeeLee.getEmployeeName() + "���� ����� " + employeeLee.getEmployeeId() + "�Դϴ�."); // �����޸𸮿�
		System.out.println(employeeKim.getEmployeeName() + "���� ����� " + employeeKim.getEmployeeId() + "�Դϴ�."); // �����޸𸮿�

	}

}
