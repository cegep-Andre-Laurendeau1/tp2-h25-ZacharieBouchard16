package ca.cal.tp2.service;

import ca.cal.tp2.model.Book;
import ca.cal.tp2.repository.Repository;
import lombok.AllArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
public class LibrarianService {
    Repository bookRepository;

    public void addBook(long id, String name, LocalDate releaseDate, int amountTotal, String isbn, int borrowTime, int pages) {
        // bookRepository.save(new Book(id, name, releaseDate, amountTotal, isbn, borrowTime, pages));
    }

    public Book getBook(long id) {
        return (Book) bookRepository.get(id);
    }
}
