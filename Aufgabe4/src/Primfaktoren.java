public class Primfaktoren {

	
	/* 
	 * Diese Methode akzeptiert ein int als Parameter und liefert ein Array mit 
	 * den Primfaktoren der gegebenen Zahl zurück. Eine Schleife wird verwendet, 
	 * um die Primfaktoren zu finden. Zuerst wird überprüft, ob die Zahl durch 2
	 * teilbar ist, und falls ja, wird 2 als Primfaktor hinzugefügt und die Zahl durch 2 geteilt. 
	 * Dann wird eine Schleife von 3 bis zur Quadratwurzel der verbleibenden Zahl ausgeführt.
	 * Für jeden Schleifendurchlauf wird überprüft, ob die Zahl durch den aktuellen
	 * Wert von i teilbar ist. Wenn dies der Fall ist, wird i als Primfaktor
	 * hinzugefügt und die Zahl durch i geteilt. Dieser Vorgang wird wiederholt,
	 * bis keine weiteren Primfaktoren gefunden werden können. 
	 */

	public static int[] primeFactorize(int number) {

		if (number <= 1) {
			throw new IllegalArgumentException("Die Zahl sollte > 1 sein.");
		}

		int[] faktoren = new int[number];
		int index = 0;

		while (number % 2 == 0) {
			faktoren[index++] = 2;
			number = number / 2;
		}

		for (int i = 3; i <= Math.sqrt(number); i = i + 2) {
			while (number % i == 0) {
				faktoren[index++] = i;
				number = number / i;
			}
		}

		if (number > 1) {
			faktoren[index++] = number;
		}

		int[] ergebnis = new int[index];
		for (int i = 0; i < index; i++) {
			ergebnis[i] = faktoren[i];
		}

		return ergebnis;

	}

	
	/*
	 * Diese Methode verwendet zwei Arrays von Primfaktoren (prime1 u. prime2) 
	 * als Eingabe und gibt ein Array mit den gemeinsamen Primfaktoren zurück.
	 * Die Werte in beiden Arrays werden verglichen. Drei Index-Variablen werden verwendet 
	 * (index, i und j). Die index-variable verfolgt die Position im neuen Array
	 * und wird dann erhöht, wenn ein gemeinsamer Primfaktor gefunden wird. 
	 * Die Variablen i und j iterieren über die Arrays prime1 u. prime2.
	 * Dann wird ausgewertet, ob ein gemeinsamer Primfaktor gefunden wurde und er wird in einem neuen
	 * Array hinzugefügt. Wenn prime1[i] < prime2[j] ist, wird i erhöht,andernfalls wird j erhöht.
	 */
	
	public static int[] findCommonPrimeFactors(int[] prime1, int[] prime2) {

		if (prime1 == null || prime2 == null) {
			throw new NullPointerException("Ein Array oder beide Arrays sind null");
		}

		int[] gemeinsameFaktoren = new int[Math.min(prime1.length, prime2.length)];

		int index = 0;
		int i = 0;
		int j = 0;

		while (i < prime1.length && j < prime2.length) {

			if (prime1[i] == prime2[j]) {
				gemeinsameFaktoren[index++] = prime1[i];
				i++;
				j++;

			} else if (prime1[i] < prime2[j]) {
				i++;

			} else {
				j++;
			}
		}

		int[] ergebnis = new int[index];
		for (int k = 0; k < index; k++) {
			ergebnis[k] = gemeinsameFaktoren[k];
		}

		return ergebnis;
	}

	
	/* 
	 * Diese Methode berechnet den ggT von zwei Zahlen no1 u. no2, indem sie die 
	 * Zahl in ihre Primfaktoren zerlegt. Die Methode ruft die Methode primeFactorize 2-mal auf, 
	 * je für no1 und für no2, um die Primfaktoren beider Zahlen zu erhalten. 
	 * Dann vergleicht sie die beiden Arrays von Primfaktoren und gibt ein Array 
	 * mit den gemeinsamen Primfaktoren zurück. Der ggT wird mit 1 initialisiert. 
	 * Dann wird über jeden gemeinsamen Primfaktor iteriert und der ggT aktualisiert,
	 * indem er mit dem Primfaktor multipliziert wird.
	 */
	
	public static int calculateGgT(int no1, int no2) {

		if (no1 == 1 || no2 == 1) {
			return 1;
		}

		if (no1 < 1 || no2 < 1) {
			throw new IllegalArgumentException("Die Zahl sollte > 1 sein.");
		}

		int[] prime1 = primeFactorize(no1);
		int[] prime2 = primeFactorize(no2);
		int[] gemeinsameFaktoren = findCommonPrimeFactors(prime1, prime2);

		int ggT = 1;

		for (int faktor : gemeinsameFaktoren) {
			ggT = ggT * faktor;
		}

		return ggT;

	}

}
