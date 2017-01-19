package Core;

import java.util.ArrayList;
import java.util.Calendar;

public class Player {
    public Player(String name, int age, int yearOfGrad){
        setName(name);
        setAge(age);
        setYearOfGrad(yearOfGrad);
    }
    public Player(String name, int age){
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);

        setName(name);
        setAge(age);
        setYearOfGrad(year);
    }
    public Player(String name){
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);

        setName(name);
        setAge(0);
        setYearOfGrad(year);
    }

    private String name;
    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    private int age;
    public int getage(){return age;}
    public void setAge(int age){this.age = age;}

    private int yearOfGrad;
    public int getYearOfGrad(){return yearOfGrad;}
    public void setYearOfGrad(int yearOfGrad){this.yearOfGrad = yearOfGrad;}

    private ArrayList<GameStats> statBlock = new ArrayList<>();
    public void addStatBlock(GameStats statBlock){this.statBlock.add(statBlock);}
    public ArrayList<GameStats> getStatBlock(){return statBlock;}
}