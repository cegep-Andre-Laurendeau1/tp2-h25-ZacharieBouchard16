package ca.cal.tp2.model;

import lombok.*;

import java.util.List;

@Getter
@NoArgsConstructor
@Setter
@AllArgsConstructor
public class Borrower extends User {
    private Long id;
    private List<Fine> fines;
    private List<Borrow> lendings;
}
