package be.technifutur.plateformevoisin.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Table;
import lombok.*;

@Embeddable
@NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode @ToString
@Getter @Setter
public class Address {

    @Column(nullable = false, length = 50)
    private String street;

    @Column(nullable = false, length = 5)
    private String number;

    @Column(nullable = false, length = 5)
    private String mailbox;

    @Column(nullable = false, length = 50)
    private String city;

    @Column(nullable = false,length = 50)
    private String state;

    @Column(nullable = false, length = 4)
    private String zip;
}
