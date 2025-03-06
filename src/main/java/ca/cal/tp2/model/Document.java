package ca.cal.tp2.model;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor(force = true)
@AllArgsConstructor
@ToString
public abstract class Document {
    private long id;
    private final String name;
    private final LocalDate releaseDate;
    private final int amountTotal;
    private final List<BorrowLineItem> lendings;
}
