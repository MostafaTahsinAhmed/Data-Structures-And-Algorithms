import java.util.ArrayList;
public class NHLStats {

    //instance variable
    private List<PlayerRecord> records;

    //constructor of NHLStats
    public NHLStats(){
        records = new List<>();
    }

    //method for most points
    public void mostPoints() {
        ArrayList<PlayerRecord> mostPointsList = new ArrayList<>();
        int maximum =0;

        PlayerRecord record = records.first();
        while (record!=null){
            if(record.getMostPoints()>maximum){
                maximum = record.getMostPoints();  //updating the maximum value
                mostPointsList.clear();   //clearing the arraylist for the new maximum value
                mostPointsList.add(record);   // adding the object to the arraylist
            }else if(record.getMostPoints()==maximum){  //checking if the point is equal to the existing maximum value
                mostPointsList.add(record);
            }
            record = records.next();
        }

        for(PlayerRecord i:mostPointsList){  //printing the elements of the arraylist
            System.out.println(i.getPlayerName() + " " + i.getTeamName());
        }
    }

    //method for the most aggressive player
    public void mostAggressive(){

        ArrayList<PlayerRecord> teams = new ArrayList<>();
        int maximum = 0;

        PlayerRecord playerRecord = records.first();
        while(playerRecord !=null){
            if(playerRecord.getPenaltyMinutes()>maximum) {
                maximum =playerRecord.getPenaltyMinutes();   //updating the maximum value
                teams.clear();   //clearing the arraylist for the new maximum value
                teams.add(playerRecord);  // adding the object to the arraylist
            }else if(playerRecord.getPenaltyMinutes()==maximum){    //checking if the point is equal to the existing maximum value
                teams.add(playerRecord);
            }
            playerRecord= records.next();
        }

        for(PlayerRecord i:teams){   //printing the elements of the arraylist
            System.out.println(i.getPlayerName() + " " + i.getTeamName() + " " + i.getPosition());
        }
    }


    //method for most valueable player
    public void mostVP(){

        ArrayList<PlayerRecord> teams = new ArrayList<>();
        int maximum = 0;

        PlayerRecord playerRecord = records.first();
        while(playerRecord !=null){
            if(playerRecord.getGameWinningGoals()>maximum) {
                maximum =playerRecord.getGameWinningGoals();  //updating the maximum value
                teams.clear();    //clearing the arraylist for the new maximum value
                teams.add(playerRecord);   // adding the object to the arraylist
            }else if(playerRecord.getGameWinningGoals()==maximum){   //checking if the point is equal to the existing maximum value
                teams.add(playerRecord);
            }
            playerRecord= records.next();
        }

        for(PlayerRecord i:teams){    //printing the elements of the arraylist
            System.out.println(i.getPlayerName() + " " + i.getTeamName());
        }
    }


    //method for most promising player
    public void mostPromisingPlayer(){

        ArrayList<PlayerRecord> teams = new ArrayList<>();
        int maximum = 0;

        PlayerRecord playerRecord = records.first();
        while(playerRecord !=null){
            if(playerRecord.getShotsOnGoal()>maximum) {
                maximum =playerRecord.getShotsOnGoal();   //updating the maximum value
                teams.clear();    //clearing the arraylist for the new maximum value
                teams.add(playerRecord);   // adding the object to the arraylist
            }else if(playerRecord.getGameWinningGoals()==maximum){   //checking if the point is equal to the existing maximum value
                teams.add(playerRecord);
            }
            playerRecord= records.next();
        }

        for(PlayerRecord i:teams){   //printing the elements of the arraylist
            System.out.println(i.getPlayerName() + " " + i.getTeamName());
        }
    }


    //mehtod for most penalty minutes
    public void MostPenaltyMinutes(){

        ArrayList<String> teamNames = new ArrayList<>();
        int max =0;

        for(int i=0;i< records.size();i++){
            PlayerRecord team = records.get(i);
            int combinedPenaltyMins =0;

            for(int j=0;j< records.size();j++){    //checking for the similar team name in the list
            PlayerRecord matchingTeam = records.get(j);
                if(team.getTeamName().equals(matchingTeam.getTeamName())){
                    combinedPenaltyMins +=matchingTeam.getPenaltyMinutes();
                }
            }

            if(combinedPenaltyMins>max){
                max = combinedPenaltyMins;  //updating the maximum value
                teamNames.clear();      //clearing the arraylist for the new maximum value
                teamNames.add(team.getTeamName());  // adding the object to the arraylist
            }else if (max==combinedPenaltyMins && !teamNames.contains(team.getTeamName()))  //checking if the point is equal to the existing maximum value
                teamNames.add(team.getTeamName());                                          //and the team name is not present in the current arraylist

        }

        for(String i:teamNames){     //printing the elements of the arraylist
            System.out.println(i);
        }
    }


    //method for most winning goals
    public void MostWinningGoals(){

        ArrayList<String> teamnames = new ArrayList<String>();
        int max=0;

        for(int i=0;i<records.size();i++){
            PlayerRecord team = records.get(i);
            int combinedGoals =0;

            for(int j=0;j< records.size();j++){  //checking for the similar team name in the list
                PlayerRecord matchingTeam =  records.get(j);
                if(team.getTeamName().equals(matchingTeam.getTeamName())){
                    combinedGoals+=matchingTeam.getGameWinningGoals();
                }
            }

            if(combinedGoals>max){
                max=combinedGoals;   //updating the maximum value
                teamnames.clear();    //clearing the arraylist for the new maximum value
                teamnames.add(team.getTeamName());   // adding the object to the arraylist
            } else if (max==combinedGoals && !teamnames.contains(team.getTeamName())) {    //checking if the point is equal to the existing maximum value
                teamnames.add(team.getTeamName());                                        //and the team name is not present in the current arraylist
            }
        }

        for(String i:teamnames){   //printing the elements of the arraylist
            System.out.println(i);
        }
    }

    //method for adding PlayerRecord object in the list
    public void add(PlayerRecord object){
        records.add(object);
    }
}
