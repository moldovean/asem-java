package club.cheapok.boundary;

import club.cheapok.entity.Player;
import club.cheapok.entity.Specification;
import club.cheapok.repository.PlayerRepository;


import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class GameFactory {

    @Inject
    PlayerRepository playerRepository;

    public Player createPlayer() {
        return new Player(new Specification("Maradonna", 25));
    }

    public Player createPlayer(Specification specification) {
        return new Player(specification);
    }

    public void addPlayer(Player player) {
        playerRepository.insertPlayer(player);
    }

    public List<Player> getAllPlayers() {
        return playerRepository.getPlayers();
    }
}
