package the_weeknd.controller;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import the_weeknd.service.ArtistService;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static io.restassured.module.mockmvc.RestAssuredMockMvc.standaloneSetup;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath*:spring/artist-controller-test-context.xml"})
public class artistsControllerTest {

//    @Before
//    public void setup() {
//        standaloneSetup(new ArtistController(new ArtistService(new artistRepo)));
//    }
//
//    @Test
//    public void testRetrieveArtist() {
//
//        given()
//                .when()
//                .get("/artists/1")
//                .then()
//                .statusCode(HttpStatus.OK.value())
//
//                .body("size()", CoreMatchers.equalTo(3))
//
//                .body("id", CoreMatchers.equalTo(1))
//                .body("name", CoreMatchers.equalTo("The Weeknd"))
//                .body("birth-date", CoreMatchers.equalTo("1990-11-06"))
//                ;
//    }
}
