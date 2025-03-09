package ca.cal.tp2.service;

import ca.cal.tp2.model.Book;
import ca.cal.tp2.repository.Repository;
import lombok.AllArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
public class LibrarianService {
    private Repository<Book> bookRepository;

    public void addBook(Long id, String name, LocalDate releaseDate, int amountTotal, String author, String publisher, String isbn, int borrowTime, int pages) {
        bookRepository.save(new Book(id, name, releaseDate, amountTotal, author, publisher, isbn, borrowTime, pages));
    }

    public Book getBook(long id) {
        return bookRepository.get(id);
    }
}
