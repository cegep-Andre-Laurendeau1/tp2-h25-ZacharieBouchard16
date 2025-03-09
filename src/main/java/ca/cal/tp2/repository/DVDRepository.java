package ca.cal.tp2.repository;

import ca.cal.tp2.model.CD;
import ca.cal.tp2.model.DVD;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.time.LocalDate;
import java.util.List;

public class DVDRepository extends DocumentRepository<DVD> {
    public DVDRepository() {
        super(DVD.class);
    }

    @Override
    public List<DVD> getByYear(int year) {
        EntityManager em = emf.createEntityManager();

        Query query = em.createQuery("SELECT dvd FROM DVD dvd WHERE dvd.releaseDate BETWEEN :yearStart AND :yearEnd");
        query.setParameter("yearStart", LocalDate.of(year, 1, 1));
        query.setParameter("yearEnd", LocalDate.of(year, 12, 31));
        em.close();
        return query.getResultList();
    }
}
