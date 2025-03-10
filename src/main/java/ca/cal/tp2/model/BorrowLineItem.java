package ca.cal.tp2.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor(force = true)
@Entity
public class BorrowLineItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn
    private Borrow borrowListing;
    private LocalDate returnDate;
    private final LocalDate dueDate;
    private Long documentId;

    public BorrowLineItem(Document document) {
        documentId = document.getId();
        dueDate = LocalDate.now().plusWeeks(document.getBorrowTime());
    }


}
