package ca.cal.tp2.model;

import jakarta.persistence.*;
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
    private Long documentId;
}
