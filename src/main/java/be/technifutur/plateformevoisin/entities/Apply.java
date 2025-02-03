package be.technifutur.plateformevoisin.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode @ToString
public class Apply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;

    @Column
    @Getter @Setter
    private String status;

    @ManyToOne
    @Getter @Setter
    private User userDo;

    @ManyToOne
    @Getter @Setter
    private User userRecieve;

}
