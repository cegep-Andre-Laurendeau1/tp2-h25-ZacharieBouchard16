package ca.cal.tp2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Entity
public class BorrowLineItem {
    @Id
    private Long id;
    @ManyToOne
    @JoinColumn
    private Borrow borrowListing;
    private LocalDate returnDate;
    private final LocalDate dueDate;
}
