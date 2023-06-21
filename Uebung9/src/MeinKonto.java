public class MeinKonto {
    private float kontostand;
    private float ueberweisungslimit;
    private float dispolimit;

    public MeinKonto(float kontostand, float ueberweisungslimit, float dispolimit) throws IllegalArgumentException {
        if (ueberweisungslimit < 0 || dispolimit > 0) {
            throw new IllegalArgumentException("Ungültige Werte für Überweisungs- oder Dispolimit.");
        }
        this.kontostand = kontostand;
        this.ueberweisungslimit = ueberweisungslimit;
        this.dispolimit = dispolimit;
    }

    public float getKontostand() {
        return kontostand;
    }

    public void einzahlen(float summe) throws IllegalArgumentException {
        if (summe < 0) {
            throw new IllegalArgumentException("Einzahlungsbetrag darf nicht negativ sein.");
        }
        kontostand += summe;
    }

    public void abheben(float summe) throws IllegalArgumentException {
        if (summe < 0) {
            throw new IllegalArgumentException("Abhebungsbetrag darf nicht negativ sein.");
        }
        if (kontostand - summe < dispolimit) {
            throw new IllegalArgumentException("Dispolimit würde durch diese Abhebung überschritten.");
        }
        kontostand -= summe;
    }

    public void ueberweisen(float summe, MeinKonto empfaenger) throws IllegalArgumentException {
        if (summe < 0) {
            throw new IllegalArgumentException("Überweisungsbetrag darf nicht negativ sein.");
        }
        if (summe > ueberweisungslimit) {
            throw new IllegalArgumentException("Überweisungsbetrag überschreitet das Überweisungslimit.");
        }
        abheben(summe);
        empfaenger.einzahlen(summe);
    }
}
