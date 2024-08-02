import java.util.Scanner;
public class Exersice2 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int testcases = in.nextInt();
        in.nextLine();

        for(int i=1;i<=testcases;i++){
            System.out.println("Test case: " + i);


            Rectangle2 rect1 = new Rectangle2(in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt());

            Rectangle2 rect2 = new Rectangle2(in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt());


            System.out.println(rect1);
            System.out.println(rect2);

            in.nextLine();

            System.out.println("Is Rectangle 2 contained in Rectangle 1? " + rect1.contains(rect2));
            System.out.println("Is Rectangle 2 touches Rectangle 1? " + rect2.touches(rect1));

        }
    }
}

