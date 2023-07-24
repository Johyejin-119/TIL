package ch10;

public class BirthDay {
	private int day;
	private int month;
	private int year;
	
	private boolean isValid; // �⺻���� false
	
	public int getDay() { // ������ ��������
		return day;
	}
	
	public void setDay(int day) { // ������ �����Ҷ�
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month <1 || month>12) { // ��ȿ���� �ʴ� ���� ��
			isValid = false;
		}
		else {
			isValid = true; // ��ȿ�� ���� ��
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
		if(isValid) { // isValid���� true�� if�� ����. isValid�� ������ �� true
			System.out.println(year + "�� " + month + "�� " + day + "�� �Դϴ�.");
		}
		else {
			System.out.println("��ȿ���� ���� ��¥�Դϴ�.");
		}
	}
}
