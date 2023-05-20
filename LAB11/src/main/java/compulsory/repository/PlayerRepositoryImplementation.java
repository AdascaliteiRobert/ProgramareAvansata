package compulsory.repository;

import compulsory.model.Player;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Player repository implementation.
 */
@Repository
public class PlayerRepositoryImplementation implements PlayerRepository {
    private final List<Player> players = new ArrayList<>();

    public List<Player> getAllPlayers() {
        return players;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

}
