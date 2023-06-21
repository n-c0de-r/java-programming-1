import java.util.Arrays;

public class Folien {
	
	public static boolean gleichLang (int[] arr1, int[] arr2) {
		if(arr1.length != arr2.length)return false;
		else
			return true;
	}
	
	public static boolean istGleich (int[] a1, int[] a2) {
		
		if (a1.length != a2.length)
			return false;
		
		for (int i=0; i < a1.length; i++) {
			if (a1[i] != a2[i])
				return false;
			}
		return true;
		}

	public static void main(String[] args) {
		
		int[] arrayAb = new int[7];
		int[] arrayBb = new int[6];
		System.out.println(gleichLang(arrayAb,arrayBb));
		
		int[] arrayA = {10,-20,99};
		int[] arrayB = {10,-20,99};
		System.out.println(istGleich(arrayA,arrayB));

		int[] bArray;
		bArray = new int[4];
		bArray[1] = 666;
		
		int a = 6;
		int[] numeros = new int[a];
		numeros[5] = 6;
		
		System.out.print("Somos Cevichocho ");
		System.out.println(bArray[1]);
		System.out.println(bArray[1] < 0);
		System.out.println("Gracias por nada.");
		System.out.println(numeros[5]);
		
		//baeldung: for loop
		
		int[] array = new int [5];
		for (int i = 0; i < array.length; i++) {
			array [i] = i + 2;
		}
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		
		System.out.println();
		
		//Arrays.toString method
		
		int [] cArray = {1, 2, 3, 4};
		System.out.println(Arrays.toString(cArray));
		
		// ausgabe auf  der konsole mit for-loop
		System.out.println();
		
		for (int i = 0; i <cArray.length; i++) {
			System.out.println(cArray[i]);
		}
		
		//for-each loop
		System.out.println();
		
		for (int elem : cArray) {
			System.out.println(elem);
			
			//alternative schreibweise
			
			// int array[]
			
			
			// multi-dimensional arrays
			
			//init 1
			int[][] arrayU = {{11,21}, {3,33,13}, {-6}};
			
			//init 2
			int[][] arrayT = new int[3][];
			arrayT[0] = new int[] {11,21};
			arrayT[1] = new int[] {3,33,13};
			arrayT[2] = new int[] {-6};
			
			
		}

	}

}
