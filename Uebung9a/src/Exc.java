
public class Exc {

	public static void main(String[] args) {
		
		
		System.out.println(berechneDiv(10,0));
	
	}
	
	public static int berechneDiv(int a, int b) {
		int c = 0;
		
		try {
			c = a / b;
		}
		catch(ArithmeticException e) {
			System.out.println("Division durch null!");
		}
		finally {
			System.out.println("Final");
		}
		System.out.println("Ende");
		return c;

	}

}
