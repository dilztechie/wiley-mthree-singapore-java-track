/*
 * Accept 2 Matrix From the User matrixA & matrixB of 3 x 3
 * Find the Resultant Matrix : matrixR = matrixA + matrixB
 * Corresponding Element of matrixA + Corresponding Element of matrixB  = Corresponding Element of matrixR
 * Finally, Display matrixA, matrixB & matrixR
 * 
 * matrixA
 * 1	2	3
 * 4	5	6
 * 7	8	9
 * 
 * matrixB
 * 7	8	9
 * 1	2	3
 * 4	5	6
 * 
 * matrixR
 * 8	10	12
 * 5	7	9
 * 11	13	15
 * 
 */
public class ResultantMatrix {
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);

		// Declare all 3 Matrices
		int[][] matrixA = new int[3][3];
		int[][] matrixB = new int[3][3];
		int[][] matrixR = new int[3][3];

		// Accept Values in matrixA
		System.out.println("Enter Values in Matrix A:");
		for(int row = 0; row < matrixA.length; ++row) {
			for(int col = 0; col < matrixA[row].length; ++col) {
				System.out.print("Row " + (row+1) + ", Col " + (col+1) + "? ");
				matrixA[row][col] = in.nextInt();
			}
		}
		System.out.println();
		
		// Accept Value in matrixB
		System.out.println("Enter Values in Matrix B:");
		for(int row = 0; row < matrixB.length; ++row) {
			for(int col = 0; col < matrixB[row].length; ++col) {
				System.out.print("Row " + (row+1) + ", Col " + (col+1) + "? ");
				matrixB[row][col] = in.nextInt();
			}
		}
		System.out.println();
		
		// Calculate the matrixR
		for(int row = 0; row < matrixR.length; ++row) {
			for(int col = 0; col < matrixR[row].length; ++col) {
				matrixR[row][col] = matrixA[row][col] + matrixB[row][col];
			}
		}
		System.out.println();
		
		// Display matrixA
		System.out.println("Matrix A:");
		for(int row = 0; row < matrixA.length; ++row) {
			for(int col = 0; col < matrixA[row].length; ++col) {
				System.out.print(matrixA[row][col] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		// Display matrixB
		System.out.println("Matrix B:");
		for(int row = 0; row < matrixB.length; ++row) {
			for(int col = 0; col < matrixB[row].length; ++col) {
				System.out.print(matrixB[row][col] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		// Display matrixR
		System.out.println("Matrix R:");
		for(int row = 0; row < matrixR.length; ++row) {
			for(int col = 0; col < matrixR[row].length; ++col) {
				System.out.print(matrixR[row][col] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		in.close();
	}
}