package ca.cal.tp2.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Entity
public class Fine {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private double amount;
    private final LocalDate emissionDate;
    private LocalDate paymentDate;
    @ManyToOne
    @JoinColumn
    private Borrower borrower;
}
