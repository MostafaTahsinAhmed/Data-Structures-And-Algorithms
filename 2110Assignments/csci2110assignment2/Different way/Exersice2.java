import java.util.*;
public class Exersice2 {


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        long n = kb.nextLong();
        while (n!=0) {

            long startTime = System.currentTimeMillis();

            long[] longest = longestCollatzCousin(n);

            long endTime = System.currentTimeMillis();
            long executionTime = endTime - startTime;

            System.out.println(n + " " + longest[0] + " " + longest[1] + " " + executionTime);
            n=kb.nextLong();
        }
    }

    public static List<Long> generateCollatzCousin(long n) {
        List<Long> sequence = new ArrayList<>();
        while (n != 1) {
            sequence.add(n);
            if (n % 2 == 0) {
                n /= 2;
            } else {
                if(n%4==1){
                    n*=7+1;
                }else{
                    n*=7-1;
                }
            }
        }
        sequence.add(1L);
        return sequence;
    }

    public static long[] longestCollatzCousin(long limit) {
        long maxLength = 0;
        long number = 0;

        for (long i = 1; i <= limit; i++) {
            long currentLength = generateCollatzCousin(i).size();
            if (currentLength > maxLength) {
                maxLength = currentLength;
                number = i;
            }
        }
        return new long[] { number, maxLength };
    }
}

