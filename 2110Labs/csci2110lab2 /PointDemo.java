import java.util.Scanner;
public class PointDemo {

    public static void main (String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter integer coordinates x and y: ");
        int v1 = in.nextInt();
        int v2 = in.nextInt();

        System.out.println("Enter double coordinates x and y: ");
        Double v3 = in.nextDouble();
        Double v4 = in.nextDouble();

        System.out.println("Enter String coordinates x and y: ");
        String v5= in.next();
        String v6 = in.next();


        Point<Integer> m1 = new Point<>(v1,v2);
        Point<Double> m2 = new Point<>(v3,v4);
        Point<String> m3 = new Point<>(v5,v6);


        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);












    }
}
