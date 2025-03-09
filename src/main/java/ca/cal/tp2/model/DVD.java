package ca.cal.tp2.model;

import jakarta.persistence.Entity;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor(force = true)
public class DVD extends Document{
    private String director;
    private final int length;
    private final int borrowTime;
    private final String rating;

    public DVD(Long id, String name, LocalDate releaseDate, int amountTotal, String director, int length, int borrowTime, String rating) {
        super(id, name, releaseDate, amountTotal);
        this.director = director;
        this.length = length;
        this.borrowTime = borrowTime;
        this.rating = rating;
    }
}
