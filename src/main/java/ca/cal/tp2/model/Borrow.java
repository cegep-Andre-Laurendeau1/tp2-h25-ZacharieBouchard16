package ca.cal.tp2.model;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class Borrow {
    private final LocalDate lendingDate;
    private final List<BorrowLineItem> documents;
}
