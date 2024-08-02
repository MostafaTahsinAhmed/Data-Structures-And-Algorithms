import java.util.Scanner;
public class Exersice1 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int testcases = in.nextInt();

       for(int i=1;i<=testcases;i++){
           System.out.println("Test case: " + i);


           Rectangle1 rect1 = new Rectangle1(in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt());
           Rectangle1 rect2 = new Rectangle1(in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt());

           in.nextLine();

           System.out.println(rect1);
           System.out.println(rect2);

           System.out.println("Is Rectangle 2 contained in Rectangle 1? " + rect1.contains(rect2));

       }
    }
}
