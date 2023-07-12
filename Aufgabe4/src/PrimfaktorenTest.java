public class PrimfaktorenTest {

	public static void main(String[] args) {

		try {
			System.out.print("Primfaktoren von 7644:\t");
			int[] primfaktoren1 = Primfaktoren.primeFactorize(7644);
			for (int faktor : primfaktoren1) {
				System.out.print(faktor + " ");
			}

			System.out.println();

			System.out.print("Primfaktoren von 330:\t");
			int[] primfaktoren2 = Primfaktoren.primeFactorize(330);
			for (int faktor : primfaktoren2) {
				System.out.print(faktor + " ");
			}

			System.out.println();

			System.out.print("Gemeinsame Faktoren:\t");
			int[] gemeinsameFaktoren = Primfaktoren.findCommonPrimeFactors(primfaktoren1, primfaktoren2);
			for (int faktor : gemeinsameFaktoren) {
				System.out.print(faktor + " ");
			}

			System.out.println();

			System.out.print("ggT von 7644 und 330:\t");
			int ggT = Primfaktoren.calculateGgT(7644, 330);
			System.out.print(ggT);

			System.out.println();

			System.out.print("Primfaktoren von 1:\t");
			
			//catch innerhalb der for-loop, damit das Programm nicht abbricht. 
			
			try {
				int[] primfaktoren3 = Primfaktoren.primeFactorize(1);
				for (int faktor : primfaktoren3) {
					System.out.print(faktor + " ");
				}
			} catch (Exception e) {
				System.out.print(e.getMessage());
			}

			System.out.println();

			System.out.print("Primfaktoren von 130:\t");
			int[] primfaktoren4 = Primfaktoren.primeFactorize(130);
			for (int faktor : primfaktoren4) {
				System.out.print(faktor + " ");
			}

			System.out.println();

			System.out.print("ggT von 1 und 130:\t");
			ggT = Primfaktoren.calculateGgT(1, 130);
			System.out.print(ggT);
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}

}