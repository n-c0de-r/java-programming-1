public class Aufgaben {
	
	//8.1 Array-Länge vergleichen (floats)
	public static boolean istGleichLang (float[] arr1, float[] arr2) {
		if(arr1.length != arr2.length)
			return false;
		else
			return true;
	}
		
	//8.2 Array auf die Konsole ausgeben	
	public static int printArray(int[] array) {
		
		for (int i = 0; i <array.length; i++) {
			System.out.println(array[i]);
		}	
		return 0;
	}
	
	//for-each loop
	public static int printArray2(int[] array) {
		
		for (int elem : array) {
			System.out.println(elem);
		}
		return 0;
	}
	
	//8.3.a Array-Methoden
	
//	Implemente un método de clase getElement(int[] array, int i) que
//	para una matriz int, devuelve el valor en la i-ésima posición de la matriz. comprueba si
//	i es un parámetro de posición válido. Si no, ella debería
//	Se devuelve Integer.MIN_VALUE constante.
	
	public static int gibElement(int[] array, int i) {
		        
		if (i < 0 || i >= array.length) {
	            return Integer.MIN_VALUE; // invalid position
	    } else {
	            return array[i];
	    		}
		}

	//8.3.b
	
    public static int summiere(int[] array) {
    	
        int sum = 0;
        
        for (int i : array) {
            sum += i;
        }
        return sum;
    }
    
//8.3.c
	
    public static double mittelwert(int[] array) {
    	
        int summe = 0;
        
        for (int i = 0; i < array.length; i++) {
            summe += array[i];
        }
        return summe / array.length;
    }

//8.3.d
    
    public static int max(int[] array) {
        if(array == null || array.length == 0) {
            return Integer.MIN_VALUE;
        }
        
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        
        return max;
    }
	
    //8.4.a
    


//Diese Methode vergleicht die Elemente der beiden Arrays an jedem Index und gibt den ersten 
//    Index zurück, an dem die Elemente nicht übereinstimmen. Wenn die Arrays unterschiedliche 
//    Längen haben, wird nur bis zum kürzeren Array verglichen. Wenn alle Elemente übereinstimmen, 
//    wird die Länge des kürzeren Arrays zurückgegeben.

    public static int gibErstenIndexUngleicherElemente(char[] arr1, char[] arr2) {
        int minLength = Math.min(arr1.length, arr2.length);
        for (int i = 0; i < minLength; i++) {
            if (arr1[i] != arr2[i]) {
                return i;
            }
        }
        return minLength;
    }

    
    
    //8.4.b
    
    //Diese Methode vergleicht die Elemente der beiden Arrays an jedem Index und gibt das 
    //erste ungleiche Element des ersten Arrays zurück. Wenn die Arrays unterschiedliche 
    //Längen haben, wird nur bis zum kürzeren Array verglichen. Wenn alle Elemente bis 
    //zum Ende des kürzeren Arrays übereinstimmen, wird das erste Element des längeren Arrays 
    //zurückgegeben.
   
    
    public static char gibErstesUngleichesElement(char[] arr1, char[] arr2) {
        int minLength = Math.min(arr1.length, arr2.length);
        for (int i = 0; i < minLength; i++) {
            if (arr1[i] != arr2[i]) {
                return arr1[i];
            }
        }
        if (arr1.length > arr2.length) {
            return arr1[minLength];
        } else {
            return arr2[minLength];
        }
    }

    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//8.1 test
		float[] array1 = new float[7];
		float[] array2 = new float[7];
		System.out.println(istGleichLang(array1,array2));
		
		System.out.println();
		
		//8.2 test
		int[] cArray = {1, 2, 3, 4};
		System.out.println("for-loop:");
		printArray(cArray);
		
		System.out.println();
		System.out.println("for-each-loop:");
		printArray2(cArray);
		
		//8.3 test
		//a)
		System.out.println();
		int[] eArray = {1, 22, 33, 43, 52, 67};
		System.out.println("Der Wert im index i ist: " + gibElement(eArray, 5));
		System.out.println("Ungültiger Parameter: " + gibElement(eArray, 6));		
		
		//b)
		System.out.println();
		int[] bbarray = {8,8};
		System.out.println("Die Summe des Arrays ist: " + summiere(bbarray));
		
		//c)
		System.out.println();
		int [] carray = {1, 22, 33, 43, 52, 67};
		System.out.println("Der Mittelwert des Arrays ist: " + mittelwert(carray));
		
		//d)
		System.out.println();
		int [] darray = {1, 22, 33, 435, 52, 67};
		System.out.println("Der maximale Wert des Arrays ist: " + max(darray));
		
		//8.4.a & b
		
	    char[] a1 = {'a', 'b'};
	    char[] a2 = {'a', 'b', 'd'};
	    char[] b1 = {'a', 'b', 'c'};
	    char[] b2 = {'a', 'b'};
	    
	    System.out.println();
	    System.out.println(gibErstenIndexUngleicherElemente(a1, a2)); // Ausgabe: 2
	    System.out.println(gibErstenIndexUngleicherElemente(b1, b2)); // Ausgabe: 2
	    
	    System.out.println(gibErstesUngleichesElement(a1, a2)); // Ausgabe: d
	    System.out.println(gibErstesUngleichesElement(b1, b2)); // Ausgabe: c
	}
}