import java.sql.SQLOutput;
import java.util.Scanner;
public class Exersice7{
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);


        long startTime, endTime, executionTime;
        startTime = System.currentTimeMillis();

        System.out.println("Enter a number:");
        int number = in.nextInt();
        System.out.print(number + " ");
        System.out.print(moveDiscs(number,1,3,2));


        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println(" " + executionTime);

    }



    public static long moveDiscs(int n,int from,int to,int temp){
        long count =0;
        if(n>0){
           count= moveDiscs(n-1,from,temp,to);
            count++;
           count= count +  moveDiscs(n-1,temp,to,from);
        }
        return count;
    }
}
