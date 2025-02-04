package be.technifutur.plateformevoisin.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "neighbor")
@NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode @ToString
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;

    @Column(nullable = false, name = "first_name")
    @Getter @Setter
    private String firstName;

    @Column(nullable = false, name = "last_name")
    @Getter @Setter
    private String lastName;

    @Column(nullable = false, unique = true)
    @Getter @Setter
    private String email;

    @Column(nullable = false)
    @Getter @Setter
    private String password;

    @Embedded
    @Getter @Setter
    private Address address;

    @Column(nullable = false, unique = true, length = 10)
    @Getter @Setter
    private int phoneNumber;

    @Column
    @Getter @Setter
    private String profilePicture;

    @Column
    @Getter @Setter
    private boolean isActive;

    public User(String firstName, String lastName, String email, String password, Address address, int phoneNumber, String profilePicture) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.profilePicture = profilePicture;
    }
}
