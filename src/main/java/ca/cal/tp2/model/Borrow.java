package ca.cal.tp2.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Entity
public class Borrow {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private final LocalDate lendingDate;
    @OneToMany(mappedBy = "borrowListing")
    private List<BorrowLineItem> documents;
}
