package ca.cal.tp2;

import ca.cal.tp2.exceptions.DocumentUnavailableException;
import ca.cal.tp2.service.BorrowerService;
import ca.cal.tp2.service.LibrarianService;

import java.sql.SQLException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws InterruptedException, SQLException {
        TcpServer.createTcpServer();
        LibrarianService librarianService = new LibrarianService();
        BorrowerService borrowerService = new BorrowerService();

        librarianService.addBook("The Trial", LocalDate.now(), 1, "Franz Kafka", "Whatever", "11111111", 3, 125);
        System.out.println(librarianService.getBook(1L));
        System.out.println(librarianService.getBooksByYear(2025));

        librarianService.addCD("Toxicity", LocalDate.now(), 2, "System of a Down", 3, 2, "Heavy Metal");
        System.out.println(librarianService.getCDsByArtist("System of a Down"));

        librarianService.addDVD("Star Wars: Revenge of the Sith", LocalDate.now(), 1, "George Lucas", 320, 2, "PG13");
        System.out.println(librarianService.getDVDsByName("Wars"));

        borrowerService.registerBorrower("Zacharie Bouchard", "test1@gmail.com", "123456", "111-111-1111");
        System.out.println(borrowerService.getBorrower(1L));



        try {
            borrowerService.borrow(borrowerService.getBorrower(1L), 1L);
            borrowerService.borrow(borrowerService.getBorrower(1L), 1L);
        } catch (DocumentUnavailableException e) {
            e.printStackTrace();
        }

        Thread.currentThread().join();
    }
}
