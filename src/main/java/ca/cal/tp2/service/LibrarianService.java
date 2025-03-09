package ca.cal.tp2.service;

import ca.cal.tp2.model.Book;
import ca.cal.tp2.model.CD;
import ca.cal.tp2.model.DVD;
import ca.cal.tp2.repository.DocumentRepository;
import lombok.AllArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
public class LibrarianService {
    private DocumentRepository<Book> bookRepository;
    private DocumentRepository<CD> cdRepository;
    private DocumentRepository<DVD> dvdRepository;

    public void addBook(String name, LocalDate releaseDate, int amountTotal, String author, String publisher, String isbn, int borrowTime, int pages) {
        bookRepository.save(new Book(null, name, releaseDate, amountTotal, author, publisher, isbn, borrowTime, pages));
    }

    public Book getBook(Long id) {
        return bookRepository.get(id);
    }

    public List<Book> getBooksByYear(int year) {
        return bookRepository.getByYear(year);
    }
}
