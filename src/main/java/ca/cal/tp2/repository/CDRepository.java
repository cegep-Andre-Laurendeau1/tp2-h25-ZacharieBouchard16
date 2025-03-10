package ca.cal.tp2.repository;

import ca.cal.tp2.model.CD;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.time.LocalDate;
import java.util.List;


public class CDRepository extends DocumentRepository<CD> {
    public CDRepository() {
        super(CD.class);
    }

    @Override
    public List<CD> getByYear(int year) {
        EntityManager em = emf.createEntityManager();

        Query query = em.createQuery("SELECT cd FROM CD cd WHERE cd.releaseDate BETWEEN :yearStart AND :yearEnd");
        query.setParameter("yearStart", LocalDate.of(year, 1, 1));
        query.setParameter("yearEnd", LocalDate.of(year, 12, 31));
        return query.getResultList();
    }

    @Override
    public List<CD> getByCreator(String name) {
        EntityManager em = emf.createEntityManager();

        Query query = em.createQuery("SELECT cd FROM CD cd WHERE cd.artist = :artist");
        query.setParameter("artist", name);
        return query.getResultList();
    }

    @Override
    public List<CD> getByName(String name) {
        EntityManager em = emf.createEntityManager();

        Query query = em.createQuery("SELECT cd FROM CD cd WHERE cd.name LIKE :name");
        query.setParameter("name", "%" + name + "%");
        return query.getResultList();
    }
}
