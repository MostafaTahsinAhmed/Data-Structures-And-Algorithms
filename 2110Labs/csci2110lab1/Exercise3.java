import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class Exercise3 {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int inputs = in.nextInt();

        for(int i=1;i<=inputs;i++){
            System.out.println("Test case: " + i);



            double x1 =in.nextDouble();
            double y1 = in.nextDouble();
            double radi1 = in.nextDouble();

            in.nextLine();

            double x2 =in.nextDouble();
            double y2 = in.nextDouble();
            double radi2 = in.nextDouble();

            in.nextLine();
            
            Circle cir1 = new Circle(x1,y1,radi1);
            Circle cir2 = new Circle(x2,y2,radi2);

            System.out.println(cir1);
            System.out.println(cir2);

            System.out.println("Second circle contained in first circle?: " + cir1.contains(x1,y1,radi1,x2,y2,radi2));
            System.out.println("Second circle touches first circle? : " + cir1.touches(x1,y1,radi1,x2,y2,radi2));

        }

    }

}
