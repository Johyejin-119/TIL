package ch07;

import java.util.ArrayList;
import java.util.List;

public class TravelCustomerTest {

	public static void main(String[] args) {

		TravelCustomer coustomerLee = new TravelCustomer("이순신", 40, 100);
		TravelCustomer coustomerKim = new TravelCustomer("김유신", 20, 100);
		TravelCustomer coustomerHong = new TravelCustomer("홍길동", 13, 50);
		
		List<TravelCustomer> customerList = new ArrayList<>();
		customerList.add(coustomerLee);
		customerList.add(coustomerKim);
		customerList.add(coustomerHong);
		
		System.out.println("고객 명단 출력(추가된 순서대로)");
		customerList.stream().forEach(s-> System.out.println(s)); // 전부 출력
		System.out.println();
		
		// customerList.stream().map중간연산.forEach최종연산;
		customerList.stream().map(c->c.getName()).forEach(s-> System.out.println(s)); // getName()만 출력
		System.out.println();

		System.out.println("여행 비용");
		System.out.println(customerList.stream().mapToInt(c->c.getPrice()).sum()); // getPrice() 합계 출력
		System.out.println();

		System.out.println("20세 이상 고객이름 정렬");
		// 중간 연산은 여러개 사용 가능
		customerList.stream().filter(c->c.getAge() >= 20).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
	}

}
