package ca.cal.tp2.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class BorrowLineItem {
    private LocalDate returnDate;
    private final LocalDate dueDate;
}
