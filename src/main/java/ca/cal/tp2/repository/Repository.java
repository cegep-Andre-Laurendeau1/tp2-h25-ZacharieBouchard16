package ca.cal.tp2.repository;

public interface Repository<T> {

    void save (T item);

    T get(long id);
}
