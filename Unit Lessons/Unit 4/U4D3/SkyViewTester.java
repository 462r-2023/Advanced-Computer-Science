public class SkyViewTester {
    public static void main(String[] args) {
        SkyView mat = new SkyView(3, 2, new double[] {0.3, 0.7, 0.8, 0.4, 1.4, 1.1});

        System.out.println(mat);
        System.out.println(mat.toString());

        SkyView mat2 = new SkyView(3, 2, new double[] {0.3, 0.7, 0.8, 0.4, 1.4, 1.1});
        System.out.println(mat.equals(mat2));
        mat2.setView(new double[][] 
            {{0.3, 0.7, 0.8}, {1.1, 1.4, 0.4}, {0.2, 0.5, 0.1}, {0.9, 0.6, 1.6}});
        System.out.println(mat.equals(mat2));

        System.out.println(mat2.getAverage(1, 2, 0, 1));
    }
}
