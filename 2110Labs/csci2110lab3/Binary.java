import java.util.Scanner;
public class Binary{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long startTime;
        long endTime;
        long executionTime;

        startTime = System.currentTimeMillis();

        System.out.println("Enter a positive integer:");
        int input = in.nextInt();
        while(input!=0) {
//            System.out.println("Enter a positive integer:");
//            int input = in.nextInt();

            startTime = System.currentTimeMillis();
            generateBinary(input);

            endTime = System.currentTimeMillis();
            executionTime = endTime - startTime;

            System.out.println("The execution time to generate binary numbers from 0 to " + (int) (Math.pow(2, input) - 1) + " is " + executionTime + " ms");
            System.out.println("Enter a positive integer:");
            input = in.nextInt();
            //System.out.println("Enter a positive integer:");
        }
    }

    public static void generateBinary(int n){
        for(int i=0;i<(int)(Math.pow(2,n)-1);i++){
            String binaryNumbers = Integer.toBinaryString(i);
        }
    }
}