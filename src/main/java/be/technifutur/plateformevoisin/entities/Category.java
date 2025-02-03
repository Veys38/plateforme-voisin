package be.technifutur.plateformevoisin.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode @ToString
public class Category {

    @Id
    private String id;

    @Column(nullable = false, length = 50)
    @Getter @Setter
    private String name;

    @Column(nullable = false, length = 250)
    @Getter @Setter
    private String description;

    @ManyToMany
    private List<Task> association;

    public Category() {
        association = new ArrayList<>();
    }

    public Category(String name, String description) {
        this();
        this.name = name;
        this.description = description;
    }
}
