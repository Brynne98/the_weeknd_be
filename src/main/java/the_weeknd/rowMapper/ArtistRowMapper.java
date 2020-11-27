package the_weeknd.rowMapper;

import org.springframework.jdbc.core.RowMapper;
import the_weeknd.domain.artists;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ArtistRowMapper implements RowMapper<artists> {

    @Override
    public artists mapRow(ResultSet rs, int rowNum) throws SQLException {

        long id = rs.getLong("id");
        String name = rs.getString("artist_name");
        String birthDate = rs.getString("birth_date");
        return new artists(id, name, birthDate);
    }
}
