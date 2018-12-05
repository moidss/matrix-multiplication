
public class Matrix {
   public static void main(String[] args) {
      int[][] message = { { 9, 20, 0, 9, 19 }, { 0, 2, 21, 18, 9 }, { 5, 4, 0, 1, 20 }, { 0, 20, 8, 5, 0 },
            { 3, 15, 1, 19, 20 } }; // Initializes the message Matrix
      int[][] matrixA = { { 15, 21, 2, 42, 12 }, { 13, 84, 27, 5, 55 }, { 67, 48, 29, 10, 14 }, { 0, 23, 7, 36, 75 },
            { 63, 21, 56, 93, 29 } }; // Initializes matrix A
      int[][] encrypted = new int[5][5]; // The encrypted matrix

      int messageRows = message.length; // Number of rows the first matrix has
      int messageCols = message[0].length; // Number of columns the first matrix has
      int aCols = matrixA[0].length; // Number of columns the second matrix has

      /*
       * Performs matrix multiplication where the rows of the first matrix
       * (message matrix) is multiplied to the according columns of the second
       * matrix (matrix A). Each element in the encrypted matrix stores the sum
       * of the products of the row elements of the message matrix and the
       * column elements of matrix A. I.e. The element of row 1, column 1 of the
       * message matrix is multiplied by the element in row 1, column 1 of
       * matrix A, which is added with the product of the element of row 1,
       * column 2 of the message matrix and the element of row 2, column 1 of
       * matrix A, and etc, to create the element of row 1, column 1 for the
       * encrypted matrix..
       */
      for (int i = 0; i < messageRows; i++) {
         for (int j = 0; j < aCols; j++) {
            for (int k = 0; k < messageCols; k++) {
               encrypted[i][j] += message[i][k] * matrixA[k][j];
            }
         }
      }

      // Prints the elements encrypted matrix
      for (int i = 0; i < encrypted.length; i++) {
         for (int j = 0; j < encrypted[0].length; j++) {
            System.out.println(encrypted[i][j]);
         }
      }
   }
}
