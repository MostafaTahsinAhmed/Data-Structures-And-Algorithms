public class PlayerRecord {
    private String playerName;
    private String position;
    private String teamName;
    private int gamesPlayed;
    private int goalsScored;
    private int assists;
    private int penaltyMinutes;
    private int shotsOnGoal;
    private int gameWinningGoals;

    // Parameterized constructor
    public PlayerRecord(String playerName, String position, String teamName, int gamesPlayed, int goalsScored, int assists, int penaltyMinutes, int shotsOnGoal, int gameWinningGoals) {
        this.playerName = playerName;
        this.position = position;
        this.teamName = teamName;
        this.gamesPlayed = gamesPlayed;
        this.goalsScored = goalsScored;
        this.assists = assists;
        this.penaltyMinutes = penaltyMinutes;
        this.shotsOnGoal = shotsOnGoal;
        this.gameWinningGoals = gameWinningGoals;
    }

    // Getter methods
    public String getPlayerName() {
        return playerName;
    }

    public String getPosition() {
        return position;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public int getAssists() {
        return assists;
    }

    public int getPenaltyMinutes() {
        return penaltyMinutes;
    }

    public int getShotsOnGoal() {
        return shotsOnGoal;
    }

    public int getGameWinningGoals() {
        return gameWinningGoals;
    }

    public int getMostPoints(){
        return goalsScored + assists;
    }

    //team equals method
    public boolean teamEquals(String name){
        return teamName.equals(name);
    }

}
