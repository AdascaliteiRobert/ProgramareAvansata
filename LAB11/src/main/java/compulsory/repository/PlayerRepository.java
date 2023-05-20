package compulsory.repository;

import compulsory.model.Player;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * The interface Player repository.
 */
@Repository
public interface PlayerRepository {
    /**
     * Gets all players.
     *
     * @return the all players
     */
    List<Player> getAllPlayers();

    /**
     * Add player.
     *
     * @param player the player
     */
    void addPlayer(Player player);
}
