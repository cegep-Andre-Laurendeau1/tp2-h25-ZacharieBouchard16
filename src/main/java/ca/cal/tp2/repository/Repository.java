package ca.cal.tp2.repository;

import ca.cal.tp2.model.Document;

public interface Repository {
    void save();
    Document get(long id);
}
