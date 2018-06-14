package club.cheapok.entity.dao;

import club.cheapok.entity.Player;
import club.cheapok.entity.Specification;
import club.cheapok.entity.dbs.Entry;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Stateless
public class EntryDao {
    @PersistenceContext(name = "myDatasource")
    EntityManager entityManager;

    public void saveToDb(Player player, Specification specification) {
        Entry entry = new Entry();
        entry.setName(player.getName());
        entry.setSpeed(specification.getSpeed());
        entityManager.persist(entry);
    }

}
