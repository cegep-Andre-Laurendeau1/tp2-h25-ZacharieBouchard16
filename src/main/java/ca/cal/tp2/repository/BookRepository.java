package ca.cal.tp2.repository;

import ca.cal.tp2.model.Book;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.time.LocalDate;
import java.util.List;

public class BookRepository extends DocumentRepository<Book> {

    public BookRepository() {
        super(Book.class);
    }

    @Override
    public List<Book> getByYear(int year) {
        EntityManager em = emf.createEntityManager();

        Query query = em.createQuery("SELECT b FROM Book b WHERE b.releaseDate BETWEEN :yearStart AND :yearEnd");
        query.setParameter("yearStart", LocalDate.of(year, 1, 1));
        query.setParameter("yearEnd", LocalDate.of(year, 12, 31));
        em.close();
        return query.getResultList();
    }
}
