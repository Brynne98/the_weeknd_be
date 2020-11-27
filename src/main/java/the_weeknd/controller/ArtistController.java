package the_weeknd.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import the_weeknd.domain.artists;
import the_weeknd.service.ArtistService;


@RestController
@RequestMapping("/artists")
public class ArtistController {

//    private final ArtistService artistService;
//    private Logger logger = LogManager.getLogger(ArtistController.class);
//
//    public ArtistController(ArtistService artistService) {
//        this.artistService = artistService;
//    }
//
//    @ResponseStatus(HttpStatus.OK)
//    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
//    public artists getArtist(
//            @PathVariable("id") long id
//    ) {
//
//        logger.debug("Do i get here?");
//        return artistService.retrieveArtistById(id);
//    }
}
