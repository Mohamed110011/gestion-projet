package tn.esprit.gestionprojet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.gestionprojet.entities.ProjetDetail;
@Repository
public interface ProjetDetailRepository extends JpaRepository<ProjetDetail, Long> {
}
