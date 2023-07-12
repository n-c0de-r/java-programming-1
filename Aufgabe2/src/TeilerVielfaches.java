/*
 * Programmierung 1 (PCÜ)
 * Pflichtaufgabe Nr. 2
 * Dozentin: Prof. Adrianna Alexander
 * Tutor: Tom Thiede
 * Student: Tomas Proano (S0589661)
 */

public class TeilerVielfaches {
	
	// 2.1 ggTrekursiv
	
	
	//Berechnet den ggT von zwei Zahlen, die als Parameter eingebeben werden. 

	public static int ggTrekursiv(int x, int y) {

		if (y == 0) { 		//Basisfall
			return x;
		}
		else {
			//Nach der Formel ggT(x, y) = ggT(y, x mod y):
			return ggTrekursiv(y, x % y); 
 		}	
	}
	
	// 2.2 kgV
	
	//Berechnet den kgV von zwei Zahlen, die als Parameter eingebeben werden. 
	
	public static int kgV(int x, int y) {

		if (y == 0) {       //Basisfall
			return x;
		}
		else {
			//Hier wird für die Berechnung die Methode ggTrekursiv aufgerufen:
			return (y * (x / ggTrekursiv(y, x % y))); 
		}
	}
	
	// 2.3 Zahlenpaare ausgeben
	
	/*
 		Diese Methode gibt Zahlenpaare aus, die sich innerhalb des Intervalls [x;y]
 		befinden, dessen ggT größer als den Minimalwert m ist. 
 		
 		Mithilfe von for-Schleifen, wird durch möglichen Zahlenpaaren (a,b) 
 		iteriert und eine weitere Iteration wird auch benutzt, um als return ein 
 		DT der Art int zu haben. Dadurch wird in der Console auch ausgegeben,
 		wie viele Zahlenpaare es in einem bestimmten Intervall [x;y] gibt.
 		
	*/
	
	public static int gibZahlenpaareAus(int x, int y, int m) {

		int iterationZaehler = 0;                       // Hilfsmittel (siehe return)
		
		System.out.println("Die folgende Zahlen sind Zahlenpaare, dessen ggT größer als der Minimalwert m ist: ");
		
		for (int a = x; a <= y; a++) {            		//erste Schleife für erste Zahl des Zahlenpaars
            for (int b = a + 1; b <= y; b++) {    		//zweite Schleife für zweite Zahl des Zahlenpaars
                if (ggTrekursiv(a, b) > m) {      		//Wenn der ggT(a, b) > Minimalwert ist, 
                	System.out.println(a + " " + b);    //gib auf den Bildschirm das Zahlenpaar aus.
                	iterationZaehler++;                 //Inkrementiert den Zähler.
                }
            }
        }
		
		System.out.println();
		System.out.println("Insgesamte Anzahl der Zahlenpaare, die im Intervall [x;y] liegen:");
		//Als Hilfsmittel, damit die Methode ein DT der Art int zurückgibt:
		return iterationZaehler;						
    }


	public static void main(String[] args) {
		
		// Tests ggTrekursiv durch Methodenaufruf:
		System.out.println(ggTrekursiv(24,9));
		System.out.println(ggTrekursiv(4,4));
		System.out.println(ggTrekursiv(11,13));
		System.out.println(ggTrekursiv(2,0));
		
		System.out.println();
		
		// Tests kgV durch Methodenaufruf:
		System.out.println(kgV(24,81));
		System.out.println(kgV(4,4));
		System.out.println(kgV(11,13));
		System.out.println(kgV(2,0));
		
		System.out.println();
		
		// Test gibZahlenpaareAus durch Methodenaufruf:
		System.out.println(gibZahlenpaareAus(70,100,13));	
	}
}