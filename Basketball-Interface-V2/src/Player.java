import java.util.ArrayList;

public class Player {

    String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    int age;
    int yearOfGraduation;

    ArrayList<GameStats> statBlock = new ArrayList<>();
}
