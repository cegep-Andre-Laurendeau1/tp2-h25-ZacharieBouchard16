package ca.cal.tp2.repository;

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
        return query.getResultList();
    }

    @Override
    public List<DVD> getByCreator(String name) {
        EntityManager em = emf.createEntityManager();

        Query query = em.createQuery("SELECT dvd FROM DVD dvd WHERE dvd.director = :director");
        query.setParameter("director", name);
        return query.getResultList();
    }

    @Override
    public List<DVD> getByName(String name) {
        EntityManager em = emf.createEntityManager();

        Query query = em.createQuery("SELECT dvd FROM DVD dvd WHERE dvd.name LIKE :name");
        query.setParameter("name", "%" + name + "%");
        return query.getResultList();
    }
}
