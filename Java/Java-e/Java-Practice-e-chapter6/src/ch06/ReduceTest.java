package ch06;

import java.util.Arrays;
import java.util.function.BinaryOperator;

// reduce()����
class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) {
		{if (s1.getBytes().length >= s2.getBytes().length) return s1;
		else return s2;}
	}
	
}

public class ReduceTest {

	public static void main(String[] args) {

	// reduce()���� ���� �����ϴ� ���
		
		String greetings[] = {"�ȳ��ϼ���~~~", "hello", "Good morning", "�ݰ����ϴ�^^"};
		System.out.println(Arrays.stream(greetings).reduce("", (s1, s2)->
				// length : �迭�� �Ӽ��̹Ƿ� () ����
				{if (s1.getBytes().length >= s2.getBytes().length) return s1;
				else return s2;}
				// �ѱ� 2byte, ���� 1byte => ���� 2���� �ݰ����ϴ�^^���� �ȳ��ϼ���~~~�� �� ���
				));
	
	
	// BinaryOperator�� reduce()���� ������ ��, ������ Ŭ���� ȣ���ϴ� ���
		String str = Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(str);
		
	}

}
