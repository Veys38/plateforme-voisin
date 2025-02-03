package be.technifutur.plateformevoisin.entities;

import be.technifutur.plateformevoisin.enums.Rate;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode @ToString
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;

    @Getter
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private User user;

    @Column(nullable = false)
    @Getter @Setter
    private Rate rate;

    @Column(length = 500)
    @Getter @Setter
    private String comment;

    @Column(nullable = false, updatable = false)
    @CreationTimestamp
    @Getter
    private LocalDateTime createdAt;
}
