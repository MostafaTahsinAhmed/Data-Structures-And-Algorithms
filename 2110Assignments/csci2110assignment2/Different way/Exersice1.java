import java.util.*;
public class Exersice1 {


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        while (n!=0) {

            long startTime = System.currentTimeMillis();

            int[] longest = longestCollatz(n);

            long endTime = System.currentTimeMillis();
            long executionTime = endTime - startTime;

            System.out.println(n + " " + longest[0] + " " + longest[1] + " " + executionTime);
            n=kb.nextInt();
        }
    }

    public static List<Integer> generateCollatz(int n) {
        List<Integer> sequence = new ArrayList<>();
        while (n != 1) {
            sequence.add(n);
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
        }
        sequence.add(1);
        return sequence;
    }

    public static int[] longestCollatz(int limit) {
        int maxLength = 0;
        int number = 0;

        for (int i = 1; i <= limit; i++) {
            int currentLength = generateCollatz(i).size();
            if (currentLength > maxLength) {
                maxLength = currentLength;
                number = i;
            }
        }
        return new int[] { number, maxLength };
    }
}
