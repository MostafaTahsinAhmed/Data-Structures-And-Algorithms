import java.util.ArrayList;
import java.util.Scanner;
public class Exersice1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //taking input
        long input = in.nextInt();
        while(input!=0){
            long startime,endtime,executiontime;
            startime = System.currentTimeMillis();

            ArrayList<Long> list = collatz(input);  //calling collatz method

            endtime = System.currentTimeMillis();
            executiontime = endtime-startime;

            System.out.println(input + " " + list.get(1) + " " + list.get(0) + " " + executiontime); //print statement
            input = in.nextInt();
        }

    }

    //collatz method
    public static ArrayList<Long> collatz(long input) {
        ArrayList<Long> list = new ArrayList<>();

        long maximumLength = 0;
        long maximumLengthNumber = 0;

        for (long j = 1; j <= input; j++) {
            long i = j;
            long count = 1;

            while (i != 1) {
                if (i % 2 == 0) {
                    i = i / 2;

                } else {
                    i = 3 * i + 1;
                }
                count++;
            }

            //checking the maximum length
            if (count > maximumLength) {
                maximumLength = count;
                maximumLengthNumber = j;
            }

        }

        //adding elements to the arraylist
         list.add(maximumLength);
         list.add(maximumLengthNumber);

         return list;
    }
}