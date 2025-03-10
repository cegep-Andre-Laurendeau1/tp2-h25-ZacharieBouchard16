package ca.cal.tp2.service;

import ca.cal.tp2.exceptions.DocumentUnavailableException;
import ca.cal.tp2.model.Borrower;
import ca.cal.tp2.model.Document;
import ca.cal.tp2.repository.*;

public class BorrowerService extends UserService{

    public BorrowerService() {
        super(new BookRepository(), new CDRepository(), new DVDRepository(), new BorrowerRepository());
    }

    public Borrower getBorrower(Long id) {
        return borrowerRepository.get(id);
    }

    public void borrow(Borrower borrower, Long id) throws DocumentUnavailableException {
        Document item;
        if (super.bookRepository.get(id) != null) {
            item = bookRepository.get(id);
        }
        else if (cdRepository.get(id) != null) {
            item = cdRepository.get(id);
        }
        else {
            item = dvdRepository.get(id);
        }

        borrowerRepository.borrow(borrower, item);
    }
}
