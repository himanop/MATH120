public class main {
    // For the purpose of testing each function individually feel free to comment out any line below.
    // If you do so remember to uncomment them before testing everything at once.
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        System.out.println("This is the Matrix before our operations");
        printMatrix(A);
        A=  rowSwap(A,0,1);
        System.out.println("This is the Matrix after the row swap");
        printMatrix(A);
        A= rowMultiply(A,1,2);
        System.out.println("This is the Matrix after we scale row1");
        printMatrix(A);
        A= multiplyAndAdd(A,-1,1,0);
        System.out.println("This is the final matrix after we scale do -1*row1 added to row0");
        printMatrix(A);
        //Testing Things
    }








    public static int[][] rowSwap(int[][] matrix, int rowA, int rowB)
    {
        // Do work here
    }

    public static int[][] rowMultiply(int[][] matrix, int row, int number)
    {
        // Do work here
    }

    public static int[][] multiplyAndAdd(int[][] matrix, int number, int rowA, int rowB)
    {
         // Do work here
    }

    public static void printMatrix(int[][] matrix)
    {
        int row = matrix.length;
        int col = matrix[0].length;
        int subrow;
        int subcol;
        for(subrow=0; subrow<row; subrow++) {
            for (subcol = 0; subcol < col; subcol++) {
                System.out.print(matrix[subrow][subcol]+" ");
            }
            System.out.println();
        }

    }
}
