package ca.cal.tp2.service;

import ca.cal.tp2.model.Book;
import ca.cal.tp2.model.Borrower;
import ca.cal.tp2.model.CD;
import ca.cal.tp2.model.DVD;
import ca.cal.tp2.repository.BorrowerRepository;
import ca.cal.tp2.repository.DocumentRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserService {
    protected DocumentRepository<Book> bookRepository;
    protected DocumentRepository<CD> cdRepository;
    protected DocumentRepository<DVD> dvdRepository;
    protected BorrowerRepository borrowerRepository; //Utilisation de l'implémentation, car je n'ai pas figuré comment utiliser une interface ici.

    public UserService(DocumentRepository<Book> bookRepository, DocumentRepository<CD> cdRepository, DocumentRepository<DVD> dvdRepository) {
        this.bookRepository = bookRepository;
        this.cdRepository = cdRepository;
        this.dvdRepository = dvdRepository;
    }

    public void registerBorrower(String name, String email, String password, String phoneNumber) {
        borrowerRepository.save(new Borrower(null, name, email, password, phoneNumber));
    }
}
