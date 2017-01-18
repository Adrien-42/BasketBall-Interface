import java.util.ArrayList;

public class Season {
    public Season(int startingYear){
        setSchoolyears(startingYear);
    }

    private ArrayList<Game> games = new ArrayList<>();
    public void addGame(Game game){games.add(game);}
    public ArrayList<Game> getGames(){return games;}
    public void setGame(Game game, int gameIndex){games.set(gameIndex, game);}

    private int[] schoolyears = new int[2];
    public int[] getSchoolyears(){return schoolyears;}
    public void setSchoolyears(int yearOne) {
        schoolyears[0] = yearOne;
        schoolyears[1] = yearOne+1;
    }
}