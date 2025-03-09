package ca.cal.tp2.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor(force = true)
@Entity
public class CD extends Document{
    private final String artist;
    private final int length;
    private final int borrowTime;
    private final String genre;

    public CD(Long id, String name, LocalDate releaseDate, int amountTotal, String artist, int length, int borrowTime, String genre) {
        super(id, name, releaseDate, amountTotal);
        this.artist = artist;
        this.length = length;
        this.borrowTime = borrowTime;
        this.genre = genre;
    }

}
