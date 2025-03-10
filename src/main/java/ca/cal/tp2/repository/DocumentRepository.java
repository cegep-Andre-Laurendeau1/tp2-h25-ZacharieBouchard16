package ca.cal.tp2.repository;

import ca.cal.tp2.model.Document;

import java.util.List;

public abstract class DocumentRepository<T extends Document> extends RepositoryBase<T>{
    public DocumentRepository(Class<T> entityClass) {
        super(entityClass);
    }

    public abstract List<T> getByYear(int year);
    public abstract List<T> getByCreator(String name);
    public abstract List<T> getByName(String name);
}
