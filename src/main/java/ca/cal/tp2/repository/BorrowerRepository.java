package ca.cal.tp2.repository;

import ca.cal.tp2.model.Borrower;

public class BorrowerRepository extends RepositoryBase<Borrower> {
    public BorrowerRepository() {
        super(Borrower.class);
    }
}
