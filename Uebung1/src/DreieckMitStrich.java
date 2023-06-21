public class DreieckMitStrich {
	public static void main(String[] args) {
		
		int zeilen1 = 2;

		for (int i = 1; i <= zeilen1; ++i) {
			for (int j = 7; j >= i; --j) {
				System.out.print("*");
			}  
			System.out.println();
		}

		int zeilen2 = 1;
	
		for (int i = 1; i == zeilen2; ++i) {
			for (int j = 5; j >= i; --j) {
				System.out.print(".");
			}  
			System.out.println();
		}


		int zeilen3 = 5;
	
		for (int i = 1; i <= zeilen3; ++i) {
			for (int j = 4; j >= i; --j) {
				System.out.print("*");
			}  
			System.out.println();
		}
	}
}