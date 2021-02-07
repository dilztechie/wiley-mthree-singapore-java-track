public class Matrix {
	public static void main(String[] args) {
		/*
		int[][] matrix = new int[3][3];
		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[0][2] = 3;
		matrix[1][0] = 4;
		matrix[1][1] = 5;
		matrix[1][2] = 6;
		matrix[2][0] = 7;
		matrix[2][1] = 8;
		matrix[2][2] = 9;
		*/
		
		int[][] matrix = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		// matrix.length -> number of rows in the matrix
		for(int rowIndex = 0; rowIndex < matrix.length; ++rowIndex) {
			// matrix[rowIndex].length -> number of cols in that rowIndex of the matrix
			for(int colIndex = 0; colIndex < matrix[rowIndex].length; ++colIndex) {
				System.out.print(matrix[rowIndex][colIndex] + "\t");
			}
			System.out.println();
		}
	}
}