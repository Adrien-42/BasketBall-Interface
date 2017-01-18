//This class may be deprecated
import java.util.ArrayList;

public class GameStatsTeam {
    //gameIndex is the game number
    public GameStatsTeam(Team team, int gameIndex){

    }

    private ArrayList<GameStats> gameStatsArray = new ArrayList<>();
    public void addGameStat(GameStats stat){gameStatsArray.add(stat);}
    public ArrayList<GameStats> getGameStatsArray(){return gameStatsArray;}
}