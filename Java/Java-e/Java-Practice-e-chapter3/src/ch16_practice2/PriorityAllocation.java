package ch16_practice2;

//��� ��å 3�� ���
public class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("��� ��ȭ�� ������� ��⿭���� �����ɴϴ�.");		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("����� ���� ���� �����ɷ��� ����� �������� ����մϴ�.");
	}

}
