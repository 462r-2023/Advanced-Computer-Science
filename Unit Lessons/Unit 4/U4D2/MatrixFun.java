public class MatrixFun {
    private int[][] matrix;

    public MatrixFun(int numberOfRows, int numberOfCols) {
        this(new int[numberOfRows][numberOfCols]);
    }

    public MatrixFun(int[][] starterMatrix) {
        matrix = starterMatrix;
    }

    public MatrixFun() {
        this(3, 3);
    }

    public String toString() {
        String s = "=".repeat(matrix[0].length - 1) + "\n";
        for (int[] row : matrix) {
            for (int cell : row) {
                s += cell + " ";
            }
            s += "\n";
        }
        s += "=".repeat(matrix[0].length - 1) + "\n";
        return s;
    }

    public boolean equals(MatrixFun other) {
        return toString().equals(other.toString());
    }

    public boolean equals(int[][] other) {
        return toString().equals(new MatrixFun(other).toString());
    }

    public void replaceAll(int oldValue, int newValue) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (matrix[r][c] == oldValue) {
                    matrix[r][c] = newValue;
                }
            }
        }
    }

    public void swapRow(int rowA, int rowB) {
        int[] temp = matrix[rowA];
        matrix[rowA] = matrix[rowB];
        matrix[rowB] = temp;
    }
}
