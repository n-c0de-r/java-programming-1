
public class MeinArray {

	public static void print2DArray(int[][] array) {
		
		 if (array == null || array.length == 0 || array[0].length == 0) {
	            System.out.println("Input array is empty!");
	            return;
	        }
	        
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}