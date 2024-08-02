import java.util.Scanner;
public class Prime{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long startTime;
        long endTime;
        long executionTime;


        int n = scanner.nextInt();
        while (n != 0) {

            if (n <= 0) {
                System.out.println("Please enter a positive integer greater than 0.");
            } else {
                startTime = System.currentTimeMillis();
                long nthPrime = findNthPrime(n);
                endTime =System.currentTimeMillis();
                executionTime=endTime-startTime;
                System.out.println( n + " " + nthPrime + " " + executionTime );
            }
            n = scanner.nextInt();

        }
    }


    public static long findNthPrime(int n) {
        if (n == 1) {
            return 2;
        }

        long prime = 0;
        int count = 0;
        for (long number = 2; count < n; number++) {
            if (isPrime(number)) {
                prime = number;
                count++;
            }
        }

        return prime;
    }

    public static boolean isPrime(long number) {
        if (number <= 1) {
            return false;
        }

        if (number == 2) {
            return true;
        }

        if (number % 2 == 0) {
            return false;
        }

        for (long divisor = 3; divisor * divisor <= number; divisor += 2) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
