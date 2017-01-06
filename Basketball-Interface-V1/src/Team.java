import java.util.ArrayList;

public class Team {
    Team(){
        setName("");
        setPlayers(null);
    }
    Team(String name, ArrayList<Player> players){
        setName(name);
        setPlayers(players);
    }

    String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    ArrayList<Player> players = new ArrayList<>();
    public ArrayList<Player> getPlayers() {
        return players;
    }
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }
    public void addPlayer(Player player){
        players.add(player);
    }
}