package club.cheapok.entity;

import club.cheapok.entity.enums.PlayerRole;

import javax.inject.Inject;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Specification {
    private String name;
    private Integer speed;
    @Inject
    PlayerRole playerRole;

    public Specification() {
    }

    public Specification(final String name, final Integer speed) {
        this.name = name;
        this.speed = speed;
    }

    public Specification(final String name, final int speed, final PlayerRole playerRole) {
        this.name = name;
        this.speed = speed;
        this.playerRole = playerRole;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(final int speed) {
        this.speed = speed;
    }

    public PlayerRole getPlayerRole() {
        return playerRole;
    }

    public void setPlayerRole(final PlayerRole playerRole) {
        this.playerRole = playerRole;
    }
}
