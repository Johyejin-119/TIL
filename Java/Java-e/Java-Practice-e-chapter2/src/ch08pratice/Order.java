package ch08pratice;

public class Order {
	public String orderNumber;
	public String phoneNumber;
	public String address;
	public int date;
	public int hour;
	public int price;
	public String menuNumber;
	
	public Order(String orderNumber, String phoneNumber, String address, int date, int hour, int price, String menuNumber) {
		this.orderNumber = orderNumber;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.date = date;
		this.hour = hour;
		this.price = price;
		this.menuNumber = menuNumber;
	}
	
	public void orderInfo() {  
		System.out.println("�ֹ� ���� ��ȣ: " + orderNumber);
		System.out.println("�ֹ� �ڵ��� ��ȣ: " + phoneNumber);
		System.out.println("�ֹ� �� �ּ�: " + address);
		System.out.println("�ֹ� ��¥: " + date);
		System.out.println("�ֹ� �ð�: " + hour);
		System.out.println("�ֹ� ����: " + price);
		System.out.println("�޴� ��ȣ: " + menuNumber);
	}
 }
