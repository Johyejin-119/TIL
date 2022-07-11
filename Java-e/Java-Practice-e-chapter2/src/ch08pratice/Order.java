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
		System.out.println("주문 접수 번호: " + orderNumber);
		System.out.println("주문 핸드폰 번호: " + phoneNumber);
		System.out.println("주문 집 주소: " + address);
		System.out.println("주문 날짜: " + date);
		System.out.println("주문 시간: " + hour);
		System.out.println("주문 가격: " + price);
		System.out.println("메뉴 번호: " + menuNumber);
	}
 }
