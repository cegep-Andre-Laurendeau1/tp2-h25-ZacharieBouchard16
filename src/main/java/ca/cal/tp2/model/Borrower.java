package ca.cal.tp2.model;

import jakarta.persistence.Entity;
import lombok.*;

import java.util.List;

@Getter
@NoArgsConstructor
@Setter
@AllArgsConstructor
@Entity
public class Borrower extends User {
    private List<Fine> fines;
    private List<Borrow> lendings;
}
