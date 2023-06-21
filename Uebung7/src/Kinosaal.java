public class Kinosaal {
    private int saalNummer;
    private int anzahlSitzplaetzeSaal;

    private static int anzahlSitzplaetzeKino;
    private static int anzahlKinosaele;

    public Kinosaal() {
        saalNummer = ++anzahlKinosaele;
    }

    public void setAnzahlSitzplaetzeSaal(int anzahlSitzplaetzeSaal) {
        this.anzahlSitzplaetzeSaal = anzahlSitzplaetzeSaal;
        anzahlSitzplaetzeKino += anzahlSitzplaetzeSaal;
    }

    public int getAnzahlSitzplaetzeSaal() {
        return anzahlSitzplaetzeSaal;
    }

    public static int getAnzahlSitzplaetzeKino() {
        return anzahlSitzplaetzeKino;
    }

    public static int getAnzahlKinosaele() {
        return anzahlKinosaele;
    }

    public void print() {
        System.out.println("SaalNr: " + saalNummer + " hat " + anzahlSitzplaetzeSaal + " Sitzplätze.");
    }
}