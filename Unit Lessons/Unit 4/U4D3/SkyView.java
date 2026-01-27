public class SkyView {
    private double[][] view;
    private double[][] viewPrefixSums;

    public SkyView(int numberOfRows, int numberOfCols, double[] scanned) {
        if (numberOfRows * numberOfCols < scanned.length) {
            throw new IllegalArgumentException("List size given is too small!");
        }
        view = new double[numberOfRows][numberOfCols];
        int i = 0;
        for (int r = 0; r < numberOfRows; r++) {
            if (r % 2 == 0) {
                for (int c = 0; c < numberOfCols; c++) {
                    view[r][c] = scanned[i];
                    i++;
                }
            } else {
                for (int c = numberOfCols - 1; c > -1; c--) {
                    view[r][c] = scanned[i];
                    i++;
                }
            }
        }
        setView(view);
    }

    public double[][] getView() {
        return view;
    }

    public void setView(double[][] view) {
        this.view = view;
        viewPrefixSums = new double[view.length + 1][view[0].length + 1];
        for (int r = 0; r < viewPrefixSums.length; r++) {
            viewPrefixSums[r][0] = 0;
        }
        for (int c = 1; c < viewPrefixSums[0].length; c++) {
            viewPrefixSums[0][c] = 0;
        }
        for (int r = 0; r < view.length; r++) {
            for (int c = 0; c < view[r].length; c++) {
                viewPrefixSums[r + 1][c + 1] = view[r][c] + viewPrefixSums[r + 1][c]
                        + viewPrefixSums[r][c + 1] - viewPrefixSums[r][c];
            }
        }
    }

    public String toString() {
        String s = "";
        for (double[] r : view) {
            for (double c : r) {
                s += c + " ";
            }
            s += "\n";
        }
        return s;
    }

    public boolean equals(SkyView other) {
        if (view.length != other.view.length || view[0].length != other.view[0].length) {
            return false;
        }
        for (int r = 0; r < view.length; r++) {
            for (int c = 0; c < view[r].length; c++) {
                if (view[r][c] != other.view[r][c]) {
                    return false;
                }
            }
        }
        return true;
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol) {
        if (startRow < 0 || startCol < 0 || endRow >= view.length || endCol >= view[0].length
                || endRow < startRow || endCol < startCol) {
            throw new IllegalArgumentException("Index out of range!");
        }
        return (viewPrefixSums[endRow + 1][endCol + 1] - viewPrefixSums[startRow][endCol + 1]
                - viewPrefixSums[endRow + 1][startCol] + viewPrefixSums[startRow][startCol])
                / ((endRow - startRow + 1) * (endCol - startCol + 1));
    }
}
