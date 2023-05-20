package compulsory.controller;

import compulsory.model.Player;
import compulsory.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * The type Player controller.
 */
@RestController
@RequestMapping("/api/game")
public class PlayerController {
    @Autowired
    private PlayerRepository playerRepository;

    /**
     * Gets all players.
     *
     * @return the all players
     */
    @GetMapping("/players")
    public List<Player> getAllPlayers() {
        return playerRepository.getAllPlayers();
    }

    /**
     * Add player response entity.
     *
     * @param player the player
     * @return the response entity
     */
    @PostMapping("/players")
    public ResponseEntity<String> addPlayer(@RequestBody Player player) {
        playerRepository.addPlayer(player);
        return ResponseEntity.ok("Player added successfully");
    }
}

