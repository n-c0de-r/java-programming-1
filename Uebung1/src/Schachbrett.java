public class Schachbrett {
	public static void main(String[] args) {
		
		int zeilen = 9;

			for(int i = 1; i <= zeilen; i++) {
	
				for(int j = 1; j <= 4; j++) {
					System.out.print("*");
					System.out.print(".");
				}
				
				System.out.print("*");
				System.out.println();

				for(int j = 1; j <= 4; j++) {
					System.out.print(".");
					System.out.print("*");
				}
				
				System.out.print(".");
				System.out.println();
			}
		System.out.println();
	}
}
