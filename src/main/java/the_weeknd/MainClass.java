package the_weeknd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import the_weeknd.dao.ArtistDAO;
import the_weeknd.dao.PersonDAO;
import the_weeknd.domain.Person;
import the_weeknd.domain.artists;
import the_weeknd.service.PersonService;

import javax.transaction.Transactional;

public class MainClass {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ArtistDAO artistDAO = context.getBean(ArtistDAO.class);

        artists artist = new artists(2, "Denzel Curry", "1989-03-10");
        artistDAO.createArtist(artist);
    }
}
