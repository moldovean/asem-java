package md.asem;

import club.cheapok.entity.Player;

public class PlayerEater {
    private Player player;

    public PlayerEater(final Player player) {
        this.player = player;
    }

    public Player modifyPlayer() {
        player.setName("Adrian");
        return player;
    }
}
