import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("SOOCER GAME SETUP");

        Player srini =new Player("Srini");
        Field dalField = new Field(0.0,0.0,500.0,400.0); //creating Field object
        Ball soccerBall = new Ball(100.0,200.0);  //creating soccerBall object
        System.out.println(srini + "\n" + dalField + "\n" + soccerBall);
        System.out.println("\n");


        srini.Kick(dalField,soccerBall,300.0,45.0);
        //System.out.println(srini + " kicks the ball for a dis-tance of 300.0 pixels at 45.0 degrees");
        System.out.println(soccerBall);
        System.out.println("\n");


        srini.Kick(dalField,soccerBall,500.0,0.0);
        //System.out.println(srini + " kicks the ball for a dis-tance of 500.0 pixels at 0.0 degrees");
        System.out.println(soccerBall);
        System.out.println("\n");


        srini.Kick(dalField,soccerBall,100.0,270.0);
        //System.out.println(srini + " kicks the ball for a dis-tance of 100.0 pixels at 270.0 degrees");
        System.out.println(soccerBall);
        System.out.println("\n");


        for(int i=0;i<10;i++){

            //generating random numbers for player1
            double distance1 = (Math.random() * (700.0-200.0)) + 200.0;
            double angle1 = (Math.random() * (360.0-0.0)) + 0.00;
            Player player1 = new Player("player1");
            player1.Kick(dalField,soccerBall,distance1,angle1);
            System.out.println(soccerBall);


            //generating random numbers for player2
            double distance2 = (Math.random() * (700.0-200.0)) + 200.0;
            double angle2 = (Math.random() * (360.0-0.0)) + 0.00;
            Player player2 = new Player("player2");
            player2.Kick(dalField,soccerBall,distance2,angle2);
            System.out.println(soccerBall);
            System.out.println("\n");
        }
    }
}
