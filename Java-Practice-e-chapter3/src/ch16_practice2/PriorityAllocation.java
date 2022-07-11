package ch16_practice2;

//배분 정책 3번 방법
public class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("등급이 높은 고객은 업무능력이 우수한 상담원에게 배분합니다.");
	}

}
