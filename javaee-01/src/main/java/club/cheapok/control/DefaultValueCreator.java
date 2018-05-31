package club.cheapok.control;

import club.cheapok.entity.Player;
import club.cheapok.entity.enums.PlayerRole;

import javax.enterprise.inject.Produces;


public class DefaultValueCreator {

    @Produces
    public PlayerRole setDefaultPlayerRole() {
        // ...
        return PlayerRole.DEFENDER;
    }
}
