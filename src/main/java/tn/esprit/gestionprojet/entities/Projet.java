package tn.esprit.gestionprojet.entities;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Projet {
    @OneToOne
    private ProjetDetail projetDetail;

    @ManyToMany(mappedBy = "projets")
    Set<Equipe> equipes=new HashSet<>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String projet;
}
