package ca.cal.tp2.service;

import ca.cal.tp2.model.Book;
import ca.cal.tp2.model.CD;
import ca.cal.tp2.model.DVD;
import ca.cal.tp2.repository.BookRepository;
import ca.cal.tp2.repository.CDRepository;
import ca.cal.tp2.repository.DVDRepository;

import java.time.LocalDate;
import java.util.List;

public class LibrarianService extends UserService {

    public LibrarianService() {
        super(new BookRepository(), new CDRepository(), new DVDRepository());
    }

    public void addBook(String name, LocalDate releaseDate, int amountTotal, String author, String publisher, String isbn, int borrowTime, int pages) {
        super.bookRepository.save(new Book(null, name, releaseDate, amountTotal, author, publisher, isbn, borrowTime, pages));
    }

    public Book getBook(Long id) {
        return bookRepository.get(id);
    }

    public List<Book> getBooksByYear(int year) {
        return bookRepository.getByYear(year);
    }

    public List<Book> getBooksByAuthor(String author) {
        return bookRepository.getByCreator(author);
    }

    public List<Book> getBooksByName(String name) {
        return bookRepository.getByName(name);
    }

    public void addCD(String name, LocalDate releaseDate, int amountTotal, String artist, int length, int borrowTime, String genre) {
        cdRepository.save(new CD(null, name, releaseDate, amountTotal, artist, length, borrowTime, genre));
    }

    public List<CD> getCDsByYear(int year) {
        return cdRepository.getByYear(year);
    }

    public List<CD> getCDsByArtist(String artist) {
        return cdRepository.getByCreator(artist);
    }

    public List<CD> getCDsByName(String name) {
        return cdRepository.getByName(name);
    }

    public void addDVD(String name, LocalDate releaseDate, int amountTotal, String director, int length, int borrowTime, String rating) {
        dvdRepository.save(new DVD(null, name, releaseDate, amountTotal, director, length, borrowTime, rating));
    }

    public List<DVD> getDVDsByYear(int year) {
        return dvdRepository.getByYear(year);
    }

    public List<DVD> getDVDsByDirector(String director) {
        return dvdRepository.getByCreator(director);
    }

    public List<DVD> getDVDsByName(String name) {
        return dvdRepository.getByName(name);
    }
}
