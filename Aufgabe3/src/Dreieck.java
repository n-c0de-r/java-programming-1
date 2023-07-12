
public class Dreieck {

	// a) Attribut (Instanzvariable)
	private double seite;

	// b) Konstruktor
	public Dreieck(double seite) {

		if (seite > 0) {
			this.seite = seite;
		} else {
			this.seite = 0;
		}
	}

	// c) Getter-Methode für die Seite
	public double getSeite() {
		return seite;
	}

	// d) Setter-Methode für die Seite
	public void setSeite(double seite) {
		if (seite > 0) {
			this.seite = seite;
		} else {
			this.seite = 0;
		}
	}
	// e) Instanzmethode, die ermöglicht, die Seite um
	// einen bestimmten Faktor zu ändern, wenn der Faktor > 0 ist.

	public void skaliereDreieck(double faktor) {
		if (faktor > 0) {
			seite *= faktor;
		}
	}

	// f) Höhe = sqrt(3) / 2 * Seite
	public double berechneHoehe() {
		return Math.sqrt(3) / 2 * seite;
	}

	// g) Hälfte der Seite * Höhe
	public double berechneFlaeche() {
		return 0.5 * seite * berechneHoehe();
	}

	// h) Vergleicht die Fläche des Dreiecks mit dem übergebenen Dreieck d.
	public boolean vergleicheDreiecke(Dreieck d) {
		if (this.berechneFlaeche() - d.berechneFlaeche() == 0) {
			return true;
		} else
			return false;
	}
}
