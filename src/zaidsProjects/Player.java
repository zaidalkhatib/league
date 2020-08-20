package zaidsProjects;

import java.util.Collections;

public  abstract  class Player implements   Comparable <Player> {
    private String name;
    private int won=0;
    private int lost=0;
    private int tie = 0;
    private  int played=0;
    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Player o) {
        if(o.ranking()> ranking())
        {
            return 1;
        }
        else if(ranking()> o.ranking())
        {
            return -1;
        }
        else
            return 0;
    }

    public int getWon() {
        return won;
    }

    public int getLost() {
        return lost;
    }

    public int getTie() {
        return tie;
    }

    public int getPlayed() {
        return played;
    }

    public void getMatchResults(Player opponnet, int ourResults , int theirResults)
    {
        played++;
        if(ourResults>theirResults)
        {
            won++;
        }
        else if(theirResults < ourResults)
        {
            lost++;
        }
        else
        {
            tie++;
        }
        if(opponnet!=null)
        {
            opponnet.getMatchResults(null, theirResults, ourResults);
        }
    }

    public Player(String name) {
        this.name = name;
    }

    public int ranking()
    {
        return (won * 2 )+ tie;
    }

}
