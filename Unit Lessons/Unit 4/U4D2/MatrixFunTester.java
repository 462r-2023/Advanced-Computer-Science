public class MatrixFunTester {
    public static void main(String[] args) {
        MatrixFun mat = new MatrixFun(3, 3);

        System.out.println(mat);
        System.out.println(mat.toString());

        MatrixFun mat2 = new MatrixFun();

        System.out.println(mat.equals(mat2));

        int[][] mat3 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(mat.equals(mat3));

        MatrixFun mat4 = new MatrixFun(new int[][] {{1, 1, 3}, {4, 5, 6}, {1, 1, 1}});
        System.out.println(mat4);
        mat4.replaceAll(1, 9);
        System.out.println(mat4);

        MatrixFun mat5 = new MatrixFun(new int[][] {{1, 1, 3}, {4, 5, 6}, {7, 8, 9}});
        System.out.println(mat5);
        mat5.swapRow(0, 1);
        System.out.println(mat5);
    }
}
