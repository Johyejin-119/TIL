package ch16_practice2;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		System.out.println("��ȭ ���� �Ҵ� ����� �����ϼ���");
		System.out.println("R : �Ѹ� ���ʴ��");
		System.out.println("L : ��Ⱑ ���� ���� �켱");
		System.out.println("P : �켱������ ���� ���켱 ���õ� ���� ����");
	
		int a = System.in.read();
		Scheduler scheduler = null;
		
		if (a == 'R' || a == 'r') {
			scheduler = new RoundRobin();
		}
		else if (a == 'L' || a == 'l') {
			scheduler = new LeastJob();
		}
		else if (a == 'P' || a == 'p') {
			scheduler = new PriorityAllocation();
		}
		else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
			return;
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}

}
