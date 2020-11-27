package the_weeknd.dao;

import org.springframework.stereotype.Repository;
import the_weeknd.domain.Person;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class PersonDAO {

    @PersistenceContext
    private EntityManager em;

    public void createPerson(Person person) {

        em.persist(person);
    }
}
