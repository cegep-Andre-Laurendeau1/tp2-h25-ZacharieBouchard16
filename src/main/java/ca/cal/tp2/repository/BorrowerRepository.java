package ca.cal.tp2.repository;

import ca.cal.tp2.exceptions.DocumentUnavailableException;
import ca.cal.tp2.model.Borrow;
import ca.cal.tp2.model.Borrower;
import ca.cal.tp2.model.Document;
import jakarta.persistence.EntityManager;

public class BorrowerRepository extends RepositoryBase<Borrower> {

    public BorrowerRepository() {
        super(Borrower.class);
    }

    public void borrow(Borrower borrower, Document document) throws DocumentUnavailableException {
        if (!document.isAvailable()) throw new DocumentUnavailableException();

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        document.borrowDocument();
        Borrow borrow = new Borrow();
        borrow.setBorrower(borrower);
        borrow.addDocument(document);
        em.persist(borrow);
        em.merge(document);
        em.getTransaction().commit();
        em.close();
    }
}
