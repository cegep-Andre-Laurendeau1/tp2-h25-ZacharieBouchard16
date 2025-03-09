package ca.cal.tp2.repository;

import ca.cal.tp2.model.CD;

import java.util.List;


public class CDRepository extends DocumentRepository<CD> {
    public CDRepository() {
        super(CD.class);
    }

    @Override
    public List<CD> getByYear(int year) {
        return null;
    }
}
