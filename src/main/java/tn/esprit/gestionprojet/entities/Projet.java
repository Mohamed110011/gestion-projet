package tn.esprit.gestionprojet.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @OneToOne(cascade = CascadeType.ALL)
    private ProjetDetail projetDetail;

    @ManyToMany(mappedBy = "projets")
            @ToString.Exclude
            @JsonIgnore
    Set<Equipe> equipes=new HashSet<>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idProjet;
    String sujet;
}
