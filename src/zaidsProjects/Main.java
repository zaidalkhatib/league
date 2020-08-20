package zaidsProjects;

import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Leauge leauge = new Leauge("USA League");
        Soccer soccerTeam = new Soccer("San Francisco Team");
        Soccer soccerTeam2 = new Soccer("San Jose Team");
        Soccer soccerTeam3 = new Soccer("Berkeley");

//        Soccer soccerTeam3 = new Soccer("Real Team");
//        Soccer soccerTeam4 = new Soccer("Palestine  Team");
        leauge.addPlayer(soccerTeam);
        leauge.addPlayer(soccerTeam2);
        leauge.addPlayer(soccerTeam3);


        soccerTeam.getMatchResults(soccerTeam2, 2, 1);

        soccerTeam.getMatchResults(soccerTeam2, 1, 2);
        soccerTeam.getMatchResults(soccerTeam2, 1, 2);
        soccerTeam3.getMatchResults(soccerTeam2, 3, 2);
        soccerTeam3.getMatchResults(soccerTeam2, 3, 2);
        soccerTeam3.getMatchResults(soccerTeam2, 3, 2);
        System.out.println("Played: " + soccerTeam.getPlayed() + " Won: " + soccerTeam.getWon() + " Lost: " + soccerTeam.getLost() + " Tie: " + soccerTeam.getTie());
        leauge.printTeamsRanking();

        leauge.PrintTeamsNames();
    }
}
