package ca.cal.tp2.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(force = true)
public abstract class User {
    private long id;
    private final String name;
    private final String email;
    private final String password;
    private final String phoneNumber;
}
