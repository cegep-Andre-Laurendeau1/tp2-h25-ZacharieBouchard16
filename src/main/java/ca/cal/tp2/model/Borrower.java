package ca.cal.tp2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Getter
@NoArgsConstructor
@Setter
@Entity
public class Borrower extends User {
    @OneToMany(mappedBy = "borrower")
    private List<Fine> fines;
    @OneToMany(mappedBy = "borrower")
    private List<Borrow> lendings;

    public Borrower(Long id, String name, String email, String password, String phoneNumber) {
        super(id, name, email, password, phoneNumber);
    }

    @Override
    public String toString() {
        return super.toString() + "Borrower{" +
                "fines=" + fines +
                ", lendings=" + lendings +
                '}';
    }
}
