package the_weeknd.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
abstract public class BasicCRUDDAO<T> {

//    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;
//    private final String tableName;
//
//    public BasicCRUDDAO(JdbcTemplate jdbcTemplate, String tableName) {
//        namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(jdbcTemplate);
//        this.tableName = tableName;
//    }
//
//    abstract RowMapper getRowMapper();
//
//    public T retrieveByGivenColumn(Object searchBy, String column) {
//
//        MapSqlParameterSource parameters = new MapSqlParameterSource();
//        parameters.addValue("searchBy", searchBy);
//
//        StringBuilder sql = new StringBuilder("SELECT");
//        sql.append(" id, artist_name, birth_date");
//        sql.append(" FROM ");
//        sql.append(tableName);
//        sql.append(" WHERE ");
//        sql.append(column);
//        sql.append(" = :searchBy");
//
//        return (T) namedParameterJdbcTemplate.queryForObject(sql.toString(), parameters, getRowMapper());
//    }
}
