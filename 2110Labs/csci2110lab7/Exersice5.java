import java.util.Scanner;
public class Exersice5{
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = in.nextInt();
        writeVertical(number);



    }
    public static void writeVertical(int n){
        if(n<10){
            System.out.println(n);
        }else{
            writeVertical(n/10);
            System.out.println(n%10);
        }
    }
}

