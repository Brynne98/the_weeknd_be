package the_weeknd.service;

import org.springframework.stereotype.Service;
import the_weeknd.dao.PersonDAO;
import the_weeknd.domain.Person;

@Service
public class PersonService {

    private final PersonDAO personDAO;

    public PersonService(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    public void createPerson(Person person) {
        personDAO.createPerson(person);
    }
}
