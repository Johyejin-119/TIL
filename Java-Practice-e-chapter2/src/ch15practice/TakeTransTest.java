package ch15practice;

public class TakeTransTest {

	public static void main(String[] args) {
		Guest kim = new Guest("kim", 20000);
		Taxi taxigo = new Taxi("잘 간다 운수택시");
		kim.takeTaxi(taxigo);
		kim.showGuestInfo();		
		taxigo.showTaxiInfo();
		
		Guest Jo = new Guest("Jo", 50000);
		Taxi taxifast = new Taxi("빨리 간다 운수택시");
		Jo.takeTaxi(taxifast);
		Jo.showGuestInfo();
		taxifast.showTaxiInfo();
		
		Guest Ari = new Guest("Ari", 250000);
		Airplane airplane = new Airplane("높이 난다 항공사");
		Ari.takeAirplane(airplane);
		Ari.showGuestInfo();
		airplane.showAirplaneInfo();

	}

}
