package ca.cal.tp2.repository;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class RepositoryBase<T> implements Repository<T> {

    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("tp2");

    @Override
    public void save(T item) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(item);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public T get(long id) {
        return null;
    }
}
