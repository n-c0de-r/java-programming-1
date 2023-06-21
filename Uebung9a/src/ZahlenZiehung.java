public class ZahlenZiehung {
	
    public static void main(String[] args) {
        int anzahlZahlen = 100;
        int[] haeufigkeiten = new int[49]; // Array für die Häufigkeiten von 1 bis 49

        for (int i = 0; i < anzahlZahlen; i++) {
            int gezogeneZahl = zieheZahl();
            haeufigkeiten[gezogeneZahl - 1]++; // Inkrementiere die Häufigkeit der gezogenen Zahl
        }

        for (int i = 0; i < haeufigkeiten.length; i++) {
            String zahlString = String.format("%2d", i + 1); // Erzeuge einen formatierten String für die Zahl
            System.out.printf("Die Zahl %s wurde %d-mal gezogen.%n", zahlString, haeufigkeiten[i]);
        }
    }

    public static int zieheZahl() {
        return (int)(Math.random() * 49 + 1);
    }
}