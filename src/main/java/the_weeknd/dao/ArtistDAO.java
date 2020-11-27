package the_weeknd.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import the_weeknd.domain.artists;
import the_weeknd.rowMapper.ArtistRowMapper;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class ArtistDAO extends BasicCRUDDAO<artists>{

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void createArtist(artists artists) {
        em.persist(artists);
    }

//    private final JdbcTemplate jdbcTemplate;
//    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;
//    private final MapSqlParameterSource parameters = new MapSqlParameterSource();
//
//    public ArtistDAO(JdbcTemplate jdbcTemplate) {
//        super(jdbcTemplate, "artists");
//        this.jdbcTemplate = jdbcTemplate;
//        namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(jdbcTemplate);
//    }
//
//    @Override
//    RowMapper getRowMapper() {
//        return new ArtistRowMapper();
//    }
//
//    public List<artists> retrieveAllArtists() {
//
//        StringBuilder sql = new StringBuilder("SELECT * FROM artists");
//
//        return namedParameterJdbcTemplate.query(sql.toString(), new ArtistRowMapper());
//    }
//
//    public artists retrieveArtistById(long id) {
//
//        parameters.addValue("id", id);
//
//        StringBuilder sql = new StringBuilder("SELECT");
//        sql.append(" id, artist_name, birth_date");
//        sql.append(" FROM");
//        sql.append(" artists");
//        sql.append(" WHERE");
//        sql.append(" id = :id");
//
//        return namedParameterJdbcTemplate.queryForObject(sql.toString(), parameters, new ArtistRowMapper());
//    }
//
//    public artists retrieveById(long id) {
//
//        artists artists = retrieveByGivenColumn(id, "id");
//
//        return artists;
//    }
//
//    public artists retrieveByName(String name) {
//
//        artists artists = retrieveByGivenColumn(name, "artist_name");
//
//        return artists;
//    }
}
