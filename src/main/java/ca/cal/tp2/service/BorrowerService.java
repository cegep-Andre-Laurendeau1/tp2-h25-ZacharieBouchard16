package ca.cal.tp2.service;

import ca.cal.tp2.model.Borrower;
import ca.cal.tp2.repository.Repository;
import ca.cal.tp2.repository.RepositoryBase;

public class BorrowerService extends UserService{

    public BorrowerService(RepositoryBase<Borrower> borrowerRepository) {
        super(borrowerRepository);
    }

    public Borrower getBorrower(Long id) {
        return super.getBorrowerRepository().get(id);
    }
}
