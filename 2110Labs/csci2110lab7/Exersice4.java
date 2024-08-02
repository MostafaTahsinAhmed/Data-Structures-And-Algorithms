import java.util.Scanner;
public class Exersice4{
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);


        System.out.println("Enter a number:");
        int number1 = in.nextInt();
        System.out.println("Enter a number till which you want to multiply");
        int number2 = in.nextInt();

        multiples(number1,number2);


    }

    public static void multiples(int n, int m){

        if(m>0) {
            if (m == 1) {
                System.out.print(n * m);
            }else {
                System.out.print(n * m + ",");
                multiples(n, m - 1);
            }
        }
    }
}
