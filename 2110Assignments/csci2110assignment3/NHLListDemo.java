import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class NHLListDemo {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the filename to read from: ");
        String input = in.next();

        File file = new File(input);
        Scanner reader = new Scanner(file);

        StringTokenizer token;

        NHLStats listitems = new NHLStats();
        while (reader.hasNextLine()){

            String line = reader.nextLine();
            token = new StringTokenizer(line,"\t");
            String playerName = token.nextToken();
            String position = token.nextToken();
            String teamName = token.nextToken();
            int gamesPlayed =Integer.parseInt(token.nextToken());
            int goalsScored = Integer.parseInt(token.nextToken());
            int assists = Integer.parseInt(token.nextToken());
            int penaltyMinutes = Integer.parseInt(token.nextToken());
            int shotsOnGoal = Integer.parseInt(token.nextToken());
            int gamesWinningGoal = Integer.parseInt(token.nextToken());

            PlayerRecord object = new PlayerRecord(playerName,position,teamName,gamesPlayed,goalsScored,assists,penaltyMinutes,shotsOnGoal,gamesWinningGoal);
            listitems.add(object);

        }
        reader.close();


        String fileName ="nhlstatsoutput.txt";

        try{
        PrintStream fileOut = new PrintStream(new FileOutputStream(fileName));
        System.setOut(fileOut);

            System.out.println("NHL Results Summary");
            System.out.println();

            System.out.println("Players with highest points and their teams:");
            listitems.mostPoints();
            System.out.println();

            System.out.println("Most aggressive players, their teams and their positions:");
            listitems.mostAggressive();
            System.out.println();

            System.out.println("Most valuable players and their teams:");
            listitems.mostVP();
            System.out.println();

            System.out.println("Most promising players and their teams:");
            listitems.mostPromisingPlayer();
            System.out.println();

            System.out.println("Teams that had the most number of penalty minutes:");
            listitems.MostPenaltyMinutes();
            System.out.println();

            System.out.println("Teams that had the most number of game winning goals:");
            listitems.MostWinningGoals();
        }catch (FileNotFoundException e){}
    }
}
