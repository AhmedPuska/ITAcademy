package javaapplication292;

import java.util.ArrayList;
import java.util.List;

public class Game {

    List<Match> matches = new ArrayList();
    int match_id;
    int players_limit;

    public Game() {
        this.matches = new ArrayList();
        this.match_id = 0;
        this.players_limit = 4;
    }

    public void addPlayer(Player player) {
        for (Object m : matches) {
            Match match = (Match) m;
            if (match.players.size() < this.players_limit) {
                match.players.add(player);
                System.out.println("Player added to match " + match.id);
                if (match.players.size() == this.players_limit) {
                    match.Start();
                }
                return;
            }
        }
        Match new_match = new Match(++this.match_id);
        System.out.println("New match created with id " + new_match.id);
        new_match.players.add(player);
        this.matches.add(new_match);
    }
}
