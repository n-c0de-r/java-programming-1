
public class TestDreieck {

	public static void main(String[] args) {

		// Erzeuge gleichseitige Dreiecke d1 mit Breite 7 und d2 mit Breite 3.2

		Dreieck d1 = new Dreieck(7);
		Dreieck d2 = new Dreieck(3.2);

		// Berechne die Fläche von d1

		double flaeched1 = d1.berechneFlaeche();
		System.out.println("Die Fläche vom Dreieck d1 ist: " + flaeched1 + ".");

		// Skaliere d1 um Faktor 1.5
		d1.skaliereDreieck(1.5);

		// Gib die neue Länge von d1 aus
		System.out.println("Die aktualisierte Länge der Seiten von d1 ist: " + d1.getSeite() + ".");

		// Berechne die Höhe von d2

		double hoeheD2 = d2.berechneHoehe();

		// Gib die neue Höhe von d2 aus
		System.out.println("Die aktualisierte Höhe von d2 ist: " + hoeheD2 + ".");

		System.out.println();

		// Überprüfe, ob d1 und d2 gleich groß sind
		boolean vergleich = d1.vergleicheDreiecke(d2);
		System.out.println("Ist die Fläche von d1 und d2 gleich groß? " + vergleich + "! ");

		// Bemerkung
		if (d1.berechneFlaeche() == d2.berechneFlaeche()) {
			System.out.println("d1 und d2 sind gleich groß.");
		} else if (d1.berechneFlaeche() > d2.berechneFlaeche()) {
			System.out.println("d1 ist größer als d2.");
		} else {
			System.out.println("d2 ist größer als d1.");
		}
	}
}
