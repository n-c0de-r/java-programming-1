
public class KinosaalTest {

	public static void main(String[] args) {

			Kinosaal saal1 = new Kinosaal();
	        saal1.setAnzahlSitzplaetzeSaal(35);
	        saal1.print();

	        Kinosaal saal2 = new Kinosaal();
	        saal2.setAnzahlSitzplaetzeSaal(50);
	        saal2.print();

	        Kinosaal saal3 = new Kinosaal();
	        saal3.setAnzahlSitzplaetzeSaal(100);
	        saal3.print();

	        System.out.println("Gesamtzahl der Sitzplätze: " + Kinosaal.getAnzahlSitzplaetzeKino());
	        System.out.println("Anzahl der Kinosäle: " + Kinosaal.getAnzahlKinosaele());
	        
	}

}
