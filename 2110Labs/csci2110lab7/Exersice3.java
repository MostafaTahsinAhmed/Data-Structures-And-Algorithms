import java.util.Scanner;
public class Exersice3{
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = in.nextInt();
        countDown(number);

    }
    public static void countDown(int n) {

        if (n % 2 == 0) {
            if (n > 0) {
                System.out.print(n + "  ");
                countDown(n - 2);
            }
            if(n==0)
                System.out.print("BlastOff!");

        } else if (n%2==1){
            if (n > 0) {
                System.out.print(n + "  ");
                countDown(n - 2);
            }
            if(n<=1)
                System.out.print("BlastOff!");
        }
    }
}
