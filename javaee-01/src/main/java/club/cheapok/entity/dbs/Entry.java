package club.cheapok.entity.dbs;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Entry {
    @Id
    @GeneratedValue
    Long id;
    String name;
    Integer speed;

    public Entry() {
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(final Integer speed) {
        this.speed = speed;
    }
}
