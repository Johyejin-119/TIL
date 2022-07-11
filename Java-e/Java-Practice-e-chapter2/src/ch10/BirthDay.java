package ch10;

public class BirthDay {
	private int day;
	private int month;
	private int year;
	
	private boolean isValid; // 기본값은 false
	
	public int getDay() { // 데이터 가져갈때
		return day;
	}
	
	public void setDay(int day) { // 데이터 세팅할때
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month <1 || month>12) { // 유효하지 않는 달일 때
			isValid = false;
		}
		else {
			isValid = true; // 유효한 달일 때
			this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void showDate() {
		if(isValid) { // isValid값이 true면 if문 실행. isValid가 존재할 때 true
			System.out.println(year + "년 " + month + "월 " + day + "일 입니다.");
		}
		else {
			System.out.println("유효하지 않은 날짜입니다.");
		}
	}
}
