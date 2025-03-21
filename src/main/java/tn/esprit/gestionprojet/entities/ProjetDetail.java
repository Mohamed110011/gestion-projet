package tn.esprit.gestionprojet.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.sql.Date;
import java.util.List;


@Entity
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)

public class ProjetDetail {

@OneToOne(mappedBy = "projetDetail")
        @JsonIgnore
Projet projet;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    long idProjetDetail;
    String description;
    String technologie;
    long cout;
    Date dateDebut;

}
