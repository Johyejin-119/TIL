package ch15practice;

public class TakeTransTest {

	public static void main(String[] args) {
		Guest kim = new Guest("kim", 20000);
		Taxi taxigo = new Taxi("�� ���� ����ý�");
		kim.takeTaxi(taxigo);
		kim.showGuestInfo();		
		taxigo.showTaxiInfo();
		
		Guest Jo = new Guest("Jo", 50000);
		Taxi taxifast = new Taxi("���� ���� ����ý�");
		Jo.takeTaxi(taxifast);
		Jo.showGuestInfo();
		taxifast.showTaxiInfo();
		
		Guest Ari = new Guest("Ari", 250000);
		Airplane airplane = new Airplane("���� ���� �װ���");
		Ari.takeAirplane(airplane);
		Ari.showGuestInfo();
		airplane.showAirplaneInfo();

	}

}
