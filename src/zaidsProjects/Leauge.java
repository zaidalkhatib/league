package zaidsProjects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Leauge<T extends Player>  {

    private List<T> playerList = new ArrayList<>();
    private String name;

    public boolean addPlayer(T player)
    {
        playerList.add(player);
        return true;
    }
    public void PrintTeamsNames()
    {
       for(int i = 0 ; i<playerList.size() ;i++)
       {
           System.out.println(playerList.get(i).getName());
       }
    }
    public Leauge(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



   public void printTeamsRanking()
    {
        Collections.sort(playerList);
        System.out.println("Ranking:");
        for (int i = 0; i < playerList.size(); i++) {
            System.out.println(playerList.get(i).getName()+" : "+playerList.get(i).ranking());
        }
    }
//    public void sort()
//    {
//        Collections.sort(playerList);
//    }

}
