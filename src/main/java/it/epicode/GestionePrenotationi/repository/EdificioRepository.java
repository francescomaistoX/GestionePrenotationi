package it.epicode.GestionePrenotationi.repository;

import it.epicode.GestionePrenotationi.component.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EdificioRepository extends JpaRepository<Edificio,Integer> {
}
