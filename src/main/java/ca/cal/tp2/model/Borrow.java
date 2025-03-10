package ca.cal.tp2.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor(force = true)
@Entity
public class Borrow {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDate lendingDate;
    @OneToMany(mappedBy = "borrowListing", cascade = CascadeType.ALL)
    private List<BorrowLineItem> documents;
    @ManyToOne
    @JoinColumn
    private Borrower borrower;

    public void addDocument(Document document) {
        this.documents = new ArrayList<>();
        this.lendingDate = LocalDate.now();
        this.documents.add(new BorrowLineItem(document));
    }
}
