package ch18;

import java.util.Calendar;

import ch17.Employee;

public class CompanyTest {

	public static void main(String[] args) {
		// (Company��) �ν��Ͻ��� �����س��� �Ʒ��ٰ� ������ ���� ����. static�� ��쿡�� Ŭ�������·� ������ ����(�Ʒ�ó��)
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
		
		// 100���� ����ص� ���� ���
		System.out.println(company1);
		System.out.println(company2);
		
		// company�� �ܺο��� ������ �� ����, 
		// ����(Company.java)���� private(6��)���� �ϳ� �����Ǿ� �ְ�, 
		// getInstance()�θ� �ش� private�����ڸ� ����� �� �ִ�.
		
		
		// Calendar calendar = new Calendar(); ���������� �̷��� �̳�Ŭ���� ���·� ����ԵǸ� ����, Ŭ���� ���·� ����� 
		Calendar calendar = Calendar.getInstance();
		// ������ ��ü�� ������ ��, �̱��� ������ ����Ѵ�.
	}

}
