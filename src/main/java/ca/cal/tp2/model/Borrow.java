package ca.cal.tp2.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor(force = true)
@Entity
public class Borrow {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private final LocalDate lendingDate;
    @OneToMany(mappedBy = "borrowListing")
    private List<BorrowLineItem> documents;
    @ManyToOne
    @JoinColumn
    private Borrower borrower;
}
