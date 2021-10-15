import java.util.Random;
import java.util.Arrays;

public class SquareSubMatrix {
    int dimension;
    int[][] matrix;
    int firstLine;
    int firstColumn;
    int lastLine;
    int lastColumn;

    public SquareSubMatrix(int dimension, int[][] matrix, int firstLine, int firstColumn, int lastLine, int lastColumn) {
        this.dimension = dimension;
        this.matrix = matrix;
        this.firstLine = firstLine;
        this.firstColumn = firstColumn;
        this.lastLine = lastLine;
        this.lastColumn = lastColumn;
    }

    public SquareSubMatrix(int dimension, int firstLine, int firstColumn, int lastLine, int lastColumn) {
        this.dimension = dimension;
        matrix = new int[dimension][dimension];
        this.firstLine = firstLine;
        this.firstColumn = firstColumn;
        this.lastLine = lastLine;
        this.lastColumn = lastColumn;
    }

    public SquareSubMatrix clone() {
        int[][] matrixcopy = new int[dimension][dimension];
        for (int i = 0; i < getDimension(); i++) {
            for (int j = 0; j < getDimension(); j++) {
                matrixcopy[i][j] = matrix[i][j];
            }
        }
        return new SquareSubMatrix(dimension, matrixcopy, firstLine, firstColumn, lastLine, lastColumn);
    }

    public int getDimension() {
        return dimension;
    }

    public int getSubDimension() {
        return (lastLine + 1 - firstLine);
    }

    public int get(int row, int col) {
        return matrix[row + firstLine][col + firstColumn];
    }

    public void set(int row, int col, int value) {
        matrix[row + firstLine][col + firstColumn] = value;
    }

    public void sum(SquareSubMatrix submatrix) {
        for (int i = 0; i < getSubDimension(); i++) {
            for (int j = 0; j < getSubDimension(); j++) {
                set(i, j, this.get(i, j) + submatrix.get(i, j));
            }
        }
    }

    @Override
    public String toString() {
        int subD = getSubDimension();
        String str = "";
        for (int i = 0; i < subD; i++) {
            str += "[" + get(i, 0);
            for (int j = 1; j < subD; j++) {
                str += ", " + get(i, j);
            }
            str += "]\n";
        }
        return str;
    }
    public void fillOne(){
        for(int i = 0;i < getSubDimension();i++){
            for(int j = 0;j < getSubDimension();j++)
                set(i, j, 1);
        }
    }
    public void fillRand(){
        Random random = new Random();
        for(int i = 0;i < getSubDimension();i++){
            for(int j = 0;j < getSubDimension();j++){
                set(i, j, random.nextInt(12));
            }
        }
    }
    public void product(SquareSubMatrix submatr){

    }


}
