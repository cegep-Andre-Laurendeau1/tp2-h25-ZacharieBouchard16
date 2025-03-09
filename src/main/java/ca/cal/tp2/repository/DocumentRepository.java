package ca.cal.tp2.repository;

import java.util.List;

public abstract class DocumentRepository<T> extends RepositoryBase<T>{
    public DocumentRepository(Class<T> entityClass) {
        super(entityClass);
    }

    public abstract List<T> getByYear(int year);
}
