package ch16_practice2;

//��� ��å 2�� ���
public class LeastJob implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("��� ��ȭ�� ������� ��⿭���� �����ɴϴ�.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� �ְų� �������� �Ҵ�� ��ȭ ���� ���� ���� �������� ����մϴ�.");
	}

}
