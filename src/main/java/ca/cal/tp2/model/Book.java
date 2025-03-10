package ca.cal.tp2.model;

import jakarta.persistence.Entity;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor(force = true)
@Entity
public class Book extends Document {
    private final String author;
    private final String publisher;
    private final String isbn;
    private final int borrowTime;
    private final int pageAmount;

    public Book(Long id, String name, LocalDate releaseDate, int amountTotal, String author, String publisher, String isbn, int borrowTime, int pages) {
        super(id, name, releaseDate, amountTotal);
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
        this.borrowTime = borrowTime;
        this.pageAmount = pages;
    }

    @Override
    public int getBorrowTime() {
        return borrowTime;
    }

    @Override
    public String toString() {
        return super.toString() + "Book{" +
                "isbn='" + isbn + '\'' +
                ", borrowTime=" + borrowTime +
                ", pages=" + pageAmount +
                '}';
    }

}
