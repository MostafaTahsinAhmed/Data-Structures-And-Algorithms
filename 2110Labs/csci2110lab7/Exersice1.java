import java.util.Scanner;
public class Exersice1{
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);

        System.out.println("Enter a number for factorial method");
        int number1= in.nextInt();
        System.out.println(factorial(number1));


        System.out.println("Enter a number for fibonacchi method");
        int number2= in.nextInt();
        int i=1;
        while(i<number2) {
            if(i==(number2-1))
                System.out.println(fib(i));
            else {
                System.out.print(fib(i) + ",");
            }
            i++;
        }


        System.out.print("Enter two numbers for power method :");
        int number3= in.nextInt();
        int number4= in.nextInt();
        System.out.println(power(number3,number4));


    }

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static int fib(int n){

        if(n==0) {
            return 0;
        }else if(n==1){
            return 1;
        }else
        return fib(n-1) + fib(n-2);
    }

    public static int power(int x, int n){

        if(n==0){
            return 1;
        }
        return x*power(x,n-1);
    }
}
