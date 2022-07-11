package ch22;

class Bank{ // shared resource 가 되는 부분
	// 현재 보유한 돈
	private int money = 10000;

	// 돈 저축
	public /*synchronized*/ void saveMoney(int save) {
		
		//synchronized (this) {}
		int m = getMoney();
		
		try {
			Thread.sleep(3000); // 3초
			
		} catch (InterruptedException e) {
			e.printStackTrace();
			
		} 
		
		// 현재 보유한 돈 + 저축할 돈
		setMoney(m + save);	
	}
	
	// 뺄 돈
	public /*synchronized*/ void minusMoney(int minus) {
		int m = getMoney();
		
		try {
			Thread.sleep(200); // 0.2초
			
		} catch (InterruptedException e) {
			e.printStackTrace();
			
		} 
		
		// 현재 보유한 돈 - 뺄 돈
		setMoney(m - minus);
	}
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
}

class Park extends Thread{
	public void run() {
		synchronized (SyncMain.myBank) { // synchronized 블록 방식
			System.out.println("start save");
			SyncMain.myBank.saveMoney(3000);
			
			System.out.println("saveMoney(3000) 저금한 결과 : " + SyncMain.myBank.getMoney());
			
		}
	}
}

class ParkWife extends Thread {
	public void run() {
		synchronized (SyncMain.myBank) {
			System.out.println("start minus");
			SyncMain.myBank.minusMoney(1000);
			
			System.out.println("minusMoney(1000) 지출한 결과 : " + SyncMain.myBank.getMoney());
		}
		
	}
}

public class SyncMain {

	public static Bank myBank = new Bank();
	
	public static void main(String[] args) {

		Park p = new Park();
		ParkWife pw = new ParkWife();

		pw.start(); // 선 출금
		
		// 2초 후 ParkWife의 thread 돌리기
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		p.start(); // 후 입금
		
	}

}
