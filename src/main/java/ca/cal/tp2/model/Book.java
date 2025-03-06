package ca.cal.tp2.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
public class Book extends Document {
    private final String author;
    private final String publisher;
    private final String isbn;
    private final int borrowTime;
    private final int pageAmount;

    @Override
    public String toString() {
        return super.toString() + "Book{" +
                "isbn='" + isbn + '\'' +
                ", borrowTime=" + borrowTime +
                ", pages=" + pageAmount +
                '}';
    }

}
