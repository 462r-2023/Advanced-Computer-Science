public class MatrixFun {
    private int[][] matrix;

    public MatrixFun(int numberOfRows, int numberOfCols) {
        if (numberOfRows <= 0 || numberOfCols <= 0) {
            throw new IllegalArgumentException("Dimensions cannot be negative!");
        }
        this.matrix = new int[numberOfRows][numberOfCols];
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
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
        if (rowA < 0 || rowB < 0 || rowA >= matrix.length || rowB >= matrix.length) {
            throw new IllegalArgumentException("Row cannot be negative!");
        }
        int[] temp = matrix[rowA];
        matrix[rowA] = matrix[rowB];
        matrix[rowB] = temp;
    }
}
