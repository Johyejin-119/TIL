package ch16;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee employeeLee = new Employee(); // employeeLee�� main�ȿ� ����� �������� -> ���������� ���ø޸𸮿� ����
		employeeLee.setEmployeeName("�̼���"); // �� �޸�(�����޸�)��
		
		System.out.println(employeeLee.serialNum); // �����޸𸮿� 
		
		// �� �ڵ忡�� ����� �ߴ� ����? Ŭ���� ������ �����ؼ� ���!
		// serialNum�� Ŭ���� ����. �̹� �޸𸮿� �ö������ �� ��������� ������ �ν��Ͻ� �������ο� ������� ��밡��
		// System.out.println(Employee.serialNum); // �̷��� Ŭ�����̸����� �����ؼ� ���� �����
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("������");
		
		// 2���� �ν��Ͻ��� �ϳ��� �޸𸮸� �����Ѵ�.
		System.out.println(employeeLee.getEmployeeName() + "���� ����� " + employeeLee.getEmployeeId() + "�Դϴ�."); // �����޸𸮿�
		System.out.println(employeeKim.getEmployeeName() + "���� ����� " + employeeKim.getEmployeeId() + "�Դϴ�."); // �����޸𸮿�

	}

}
