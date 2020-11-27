package the_weeknd.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "artists")
public class artists {

    private long id;
    private String name;
    private String birthDate;

    protected artists() {
    }

    @JsonCreator
    public artists(
            @JsonProperty("id") long id,
            @JsonProperty("name") String name,
            @JsonProperty("birth-date") String birthDate
    ) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    @Id
    @JsonProperty("id")
    public long getId() {
        return id;
    }

    @JsonProperty("artist_name")
    public String getName() {
        return name;
    }

    @JsonProperty("birth_date")
    public String getBirthDate() {
        return birthDate;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}
