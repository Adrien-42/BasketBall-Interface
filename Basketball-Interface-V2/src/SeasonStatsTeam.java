import java.util.ArrayList;

public class SeasonStatsTeam {
    public SeasonStatsTeam(Team team){
        /*
        Should the constructor start team stats off by adding all current player game stats

        Really it should update every time a new game is added...

        for(int i = 0; i < team.getPlayers().size(); i++){
            ArrayList<Player> players = team.getPlayers();
            Player currentPlayer = players.get(i);

            addPlayerStats(currentPlayer.getStatBlock());
        }
        */
    }

    //Should the overall team stats be based on pulling from the individual player stats or
    //should it pull from the team game stats
    private ArrayList<ArrayList<GameStats>> teamStats = new ArrayList<>();
    public void addPlayerStats(ArrayList<GameStats> playerStats){teamStats.add(playerStats);}
    public ArrayList<ArrayList<GameStats>> getTeamStats(){return teamStats;}
}