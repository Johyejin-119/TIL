package ch04;

public class CustomerTest {

	public static void main(String[] args) {
/* ����Ʈ ������ ���� ��, ����� ȣ�� */
		
		Customer customerLee = new Customer(10010, "�̼���");
		customerLee.bonusPoint = 1000;
		int price = customerLee.calcPrice(1000);
		System.out.println(customerLee.showCustomerInfo() + price);
		
		System.out.println("================================"); 

		VIPCustomer vipCustomerCho = new VIPCustomer(20010, "VIPȫ�浿");
		vipCustomerCho.bonusPoint = 10000;
		int price2 = vipCustomerCho.calcPrice(1000);
		System.out.println(vipCustomerCho.showCustomerInfo() + price2);
		
		System.out.println("================================"); 
	
		Customer jj = new VIPCustomer(12345, "noname"); // VIPCustome()�� ���� �޼ҵ尡 ȣ��
		System.out.println(jj.calcPrice(1000));
		
	}

}
