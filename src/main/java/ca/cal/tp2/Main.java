package ca.cal.tp2;

import ca.cal.tp2.repository.BookRepository;
import ca.cal.tp2.repository.CDRepository;
import ca.cal.tp2.service.LibrarianService;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        LibrarianService librarianService = new LibrarianService(new BookRepository(), new CDRepository());

        librarianService.addBook("The Trial", LocalDate.now(), 1, "Franz Kafka", "Whatever", "11111111", 3, 125);
        System.out.println(librarianService.getBook(1));

        Thread.currentThread().join();
    }
}
