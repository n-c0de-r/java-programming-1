
public class Wdh {

	public static void main(String[] args) {
		
		int [] schrank = {1,2,3,4};
		
		int laenge = schrank.length;
		
		System.out.println("Länges Array: "+ laenge);
		System.out.println("Wert an Pos. 1: " + schrank[0]);
		
		schrank[0] = 2;
		
		System.out.println("Wert an Pos. 1: " + schrank[0]);
		
		System.out.println(schrank);
		
		////
		
		String [] array = new String [4];
		
		array[0] = "Hallo,";
		array[1] = "du";
		array[2] = "bist";
		array[3] = "Bicho!";
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		
		}
			////
				
		int [] feld = new int [5];
		
		for (int j = 0; j < feld.length; j++) {
		
			feld[j] = j; // an der position j ist = j
		
		}
		
		System.out.println(feld[1]);
		
		int [] feld2 = {1,2,3,4};
		
		
		System.out.println();
		
		// 2 dim
		
		int [] [] zweiDim = new int [5] [];
		
		for (int eins = 0; eins < zweiDim.length; eins++) {
			for(int zwei = 0; zwei < zweiDim[eins].length; zwei++) {
				zweiDim[eins][zwei] = eins+zwei;
			}
		} // se pone el segundo array como limite < X para que 
		//no sea mas largo que el otro. en este caso. 
		
		
		//unterschiedliche länge
		int[] [] feld3 = new int [2] [];
		feld3[0] = new int[6];
		feld3[1] = new int [19];
		
		
	}

}
