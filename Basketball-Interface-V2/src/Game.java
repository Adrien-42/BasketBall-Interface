import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Game {
    //Date in Month/Day/Year format
    public Game(String location, String date, String time){
        String[] dateArray = date.split("/");

        setLocation(location);
        setGameDate(Integer.parseInt(dateArray[2]), Integer.parseInt(dateArray[0]), Integer.parseInt(dateArray[1]), time);
    }

    private Calendar gameDate = new GregorianCalendar();
    public void setGameDate(int year, int month, int day, String time){
        this.gameDate.set(Calendar.YEAR, year);
        this.gameDate.set(Calendar.MONTH, month);
        this.gameDate.set(Calendar.DAY_OF_WEEK, day);

        String[] timeArray = time.split(":");

        this.gameDate.set(Calendar.HOUR, Integer.parseInt(timeArray[0]));
        this.gameDate.set(Calendar.MINUTE, Integer.parseInt(timeArray[1]));
    }
    public Calendar getGameDate(){return gameDate;}

    private String location;
    public String getLocation() {return location;}
    public void setLocation(String location) {this.location = location;}

    private Team[] teams = new Team[2];
    public void setTeam(Team team1, Team team2){
        this.teams[0]=team1;
        this.teams[1]=team2;
    }
    //teamSlot = 1 or 2
    public void setTeam(Team team, int teamSlot){ //teamSlot is the position in the array -1
        this.teams[teamSlot-1]=team;
    }
    public Team[] getTeams(){return teams;}

    private ArrayList<GameStats> playerStats = new ArrayList<>();
    public void addPlayerStat(GameStats playerStats){this.playerStats.add(playerStats);}
}