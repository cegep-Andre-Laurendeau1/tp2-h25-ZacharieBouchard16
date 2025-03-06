package ca.cal.tp2.model;

import lombok.Data;

@Data
public class DVD extends Document{
    private String director;
    private final int length;
    private final int borrowTime;
    private final String rating;
}
