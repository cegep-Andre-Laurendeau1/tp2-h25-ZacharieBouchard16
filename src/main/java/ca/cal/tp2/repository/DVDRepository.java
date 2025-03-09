package ca.cal.tp2.repository;

import ca.cal.tp2.model.DVD;

import java.util.List;

public class DVDRepository extends DocumentRepository<DVD> {
    public DVDRepository() {
        super(DVD.class);
    }

    @Override
    public List<DVD> getByYear(int year) {
        return null;
    }
}
