package ch03;

public class CustomerTest {

	public static void main(String[] args) {
/* ����Ʈ ������ ���� ��, ����� ȣ�� */
		Customer customerLee = new Customer(10010, "�̼���");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		System.out.println("================================"); 

		VIPCustomer vipCustomerCho = new VIPCustomer(20010, "VIPȫ�浿");
		vipCustomerCho.bonusPoint = 10000;
		System.out.println(vipCustomerCho.showCustomerInfo()); 
		
		// ������ �� ��ȯ, Ÿ�� ��ȯ
		Customer jj = new VIPCustomer(12345, "noname"); 
		// Customer�� �� ��ȯ�� �Ǿ��� ������ Customer Ÿ�Ը� ��밡�� => VIPCustomer ����ʹٸ� �������̵� �Ǵ� �ٽ� ĳ���� �ؾ���
		// VIPCustomer jj2 = new Customer(12345, "noname"); // �θ� �ڽ� ��ü�� �����ϴ� ���� �Ұ���

		
		
/* ����Ʈ ������ ���� ��, ������ ȣ��
		Customer customerLee = new Customer();
		customerLee.setCustomerName("�̼���");
		customerLee.setCustomerID(10010);
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		
		VIPCustomer vipCustomerCho = new VIPCustomer();
		vipCustomerCho.setCustomerName("VIPȫ�浿");
		vipCustomerCho.setCustomerID(20010);
		vipCustomerCho.bonusPoint = 10000;
		System.out.println(vipCustomerCho.showCustomerInfo()); */
		
		
	}

}
