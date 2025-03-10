package ca.cal.tp2.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor(force = true)
@AllArgsConstructor
@ToString
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "document_id")
    private Long id;
    private final String name;
    private final LocalDate releaseDate;
    private int amountTotal;

    public boolean isAvailable() {
        return amountTotal > 0;
    }

    public void borrowDocument() {
        this.amountTotal--;
    }

    public abstract int getBorrowTime();
}
