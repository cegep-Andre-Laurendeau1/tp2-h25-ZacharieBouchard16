package ca.cal.tp2.model;

import lombok.Data;

@Data
public class CD extends Document{
    private final String artist;
    private final int length;
    private final int borrowTime;
    private final String genre;

}
