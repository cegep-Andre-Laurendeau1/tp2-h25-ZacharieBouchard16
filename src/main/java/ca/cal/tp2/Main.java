package ca.cal.tp2;

import ca.cal.tp2.repository.BookRepository;
import ca.cal.tp2.repository.CDRepository;
import ca.cal.tp2.repository.DVDRepository;
import ca.cal.tp2.service.LibrarianService;

import java.sql.SQLException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws InterruptedException, SQLException {
        TcpServer.createTcpServer();
        LibrarianService librarianService = new LibrarianService(new BookRepository(), new CDRepository(), new DVDRepository());

        librarianService.addBook("The Trial", LocalDate.now(), 1, "Franz Kafka", "Whatever", "11111111", 3, 125);
        System.out.println(librarianService.getBook(1L));
        System.out.println(librarianService.getBooksByYear(2025));

        librarianService.addCD("Toxicity", LocalDate.now(), 2, "System of a Down", 3, 2, "Heavy Metal");
        System.out.println(librarianService.getCDsByArtist("System of a Down"));

        Thread.currentThread().join();
    }
}
