public class Player {
    Player(String name, int teamNumber, int fieldGoalMade, int fieldGoalTaken, int threePointersMade, int threePointersTaken, int points, int steals, int rebounds, int blocks, int fouls){
        setName(name);
        setTeamNumber(teamNumber);
        setFieldGoalMade(fieldGoalMade);
        setFieldGoalTaken(fieldGoalTaken);
        setThreePointersMade(threePointersMade);
        setThreePointersTaken(threePointersTaken);
        setPoints(points);
        setSteals(steals);
        setRebounds(rebounds);
        setBlocks(blocks);
        setFouls(fouls);
    }
    Player(String name, int teamNumber){
        setName(name);
        setTeamNumber(teamNumber);
        setFieldGoalMade(0);
        setFieldGoalTaken(0);
        setThreePointersMade(0);
        setThreePointersTaken(0);
        setPoints(0);
        setSteals(0);
        setRebounds(0);
        setBlocks(0);
        setFouls(0);
    }
    Player(){
        setName("");
        setTeamNumber(0);
        setFieldGoalMade(0);
        setFieldGoalTaken(0);
        setThreePointersMade(0);
        setThreePointersTaken(0);
        setPoints(0);
        setSteals(0);
        setRebounds(0);
        setBlocks(0);
        setFouls(0);
    }

    String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    int teamNumber;
    public int getTeamNumber() {
        return teamNumber;
    }
    public void setTeamNumber(int teamNumber) {
        this.teamNumber = teamNumber;
    }

    int fieldGoalTaken;
    public int getFieldGoalTaken() {
        return fieldGoalTaken;
    }
    public void setFieldGoalTaken(int fieldGoalTaken) {
        this.fieldGoalTaken = fieldGoalTaken;
    }

    int fieldGoalMade;
    public int getFieldGoalMade() {
        return fieldGoalMade;
    }
    public void setFieldGoalMade(int fieldGoalMade) {
        fieldGoalMade = fieldGoalMade;
    }

    int threePointersTaken;
    public int getThreePointersTaken() {
        return threePointersTaken;
    }
    public void setThreePointersTaken(int threePointersTaken) {
        threePointersTaken = threePointersTaken;
    }

    int threePointersMade;
    public int getThreePointersMade() {
        return threePointersMade;
    }
    public void setThreePointersMade(int threePointersMade) {
        threePointersMade = threePointersMade;
    }

    int points;
    public int getPoints() {
        return points;
    }
    public void setPoints(int points) {
        this.points = points;
    }

    int steals;
    public int getSteals() {
        return steals;
    }
    public void setSteals(int steals) {
        this.steals = steals;
    }

    int rebounds;
    public int getRebounds() {
        return rebounds;
    }
    public void setRebounds(int rebounds) {
        this.rebounds = rebounds;
    }

    int blocks;
    public int getBlocks() {
        return blocks;
    }
    public void setBlocks(int blocks) {
        this.blocks = blocks;
    }

    int fouls;
    public int getFouls() {
        return fouls;
    }
    public void setFouls(int fouls) {
        this.fouls = fouls;
    }
}