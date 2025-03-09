package ca.cal.tp2.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor(force = true)
@Entity
public class CD extends Document{
    private final String artist;
    private final int length;
    private final int borrowTime;
    private final String genre;

}
