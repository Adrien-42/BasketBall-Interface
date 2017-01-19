package Core;

import java.util.ArrayList;

public class Team {
    public Team(String name, String school){
        setTeamName(name);
        setSchool(school);
    }

    private String teamName;
    public String getTeamName() {return teamName;}

    public void setTeamName(String teamName) {this.teamName = teamName;}

    private String school;
    public String getSchool() {return school;}

    public void setSchool(String school) {this.school = school;}

    private ArrayList<Player> Players = new ArrayList<>();
    public void addPlayer(Player newPlayer){this.Players.add(newPlayer);}
    public ArrayList<Player> getPlayers(){return Players;}
}