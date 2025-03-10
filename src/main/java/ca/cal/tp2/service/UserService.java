package ca.cal.tp2.service;

import ca.cal.tp2.model.Borrower;
import ca.cal.tp2.repository.RepositoryBase;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserService {
    private RepositoryBase<Borrower> borrowerRepository;

    public void registerBorrower(String name, String email, String password, String phoneNumber) {
        borrowerRepository.save(new Borrower(null, name, email, password, phoneNumber));
    }
}
