package be.technifutur.plateformevoisin.entities;


import be.technifutur.plateformevoisin.enums.Status;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode @ToString
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;

    @Column(nullable = false, length = 50)
    @Getter @Setter
    private String title;

    @Column(nullable = false, length = 500)
    @Getter @Setter
    private String description;

    @Column(nullable = false)
    @Getter @Setter
    private Status status;

    @Column(nullable = false, updatable = false)
    @CreationTimestamp
    @Getter
    private LocalDateTime createdAt;

    @Getter
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private User taskAssignee;

}
