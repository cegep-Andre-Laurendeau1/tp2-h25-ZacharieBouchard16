package ca.cal.tp2.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Fine {
    private long id;
    private double amount;
    private final LocalDate emissionDate;
    private LocalDate paymentDate;
}
