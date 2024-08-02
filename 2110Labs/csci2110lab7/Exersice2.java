import java.util.Scanner;
public class Exersice2{
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = in.nextInt();
        countDown(number);

    }
    public static void countDown(int n){

        if(n>0){
            System.out.print(n + "    ");
            countDown(n-1);
        }else
            System.out.print("BlastOff!");
    }
}
