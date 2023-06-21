public class Dreieck {
	public static void main(String[] args) {
		int zeilen = 5;
	
		for (int i = 1; i <= zeilen; ++i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 1; i <= zeilen; ++i) {
			for (int j = 4; j >= i; --j) {
				System.out.print("*");
			}  
			System.out.println();
		}

	}
}
