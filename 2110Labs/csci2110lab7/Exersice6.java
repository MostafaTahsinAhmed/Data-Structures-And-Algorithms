import java.util.Scanner;
public class Exersice6{
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = in.nextInt();
        System.out.println(squares(number));


    }
    public static int squares(int n){
        if(n==1){
            return 1;
        }else{
            return n*n+squares(n-1);
        }
    }

}

