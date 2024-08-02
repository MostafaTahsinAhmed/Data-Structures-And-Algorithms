import java.util.Scanner;
public class MatrixMult{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long startTime;
        long endTime;
        long executionTIme;

        //startTime = System.currentTimeMillis();

        int size = in.nextInt();
        int elements = in.nextInt();

        while(size!=0) {
            double[][] Matrix1 = new double[size][size];
            double[][] Matrix2 = new double[size][size];
            double[][] newMatrix = new double[size][size];

            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    Matrix1[j][k] = elements;
                    Matrix2[j][k]=elements;
                }
            }

            startTime = System.currentTimeMillis();
            newMatrix = multiplyMatrix(Matrix1, Matrix2, size);
            endTime = System.currentTimeMillis();
            executionTIme = endTime - startTime;
            System.out.println("Size:" +size+ " Time: " +  executionTIme + "ms");


            size = in.nextInt();
            elements = in.nextInt();

        }
    }


    public static double[][] multiplyMatrix(double[][] m1,double[][] m2,int size){
        double[][] newMatrix = new double[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                double sum = 0.0;
                for (int k = 0; k < size; k++) {
                    sum += m1[i][k] * m2[k][j];
                }
                newMatrix[i][j] = sum;
            }
        }
        return newMatrix;
    }
}