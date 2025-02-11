package org.example.serveur.Repository;

import org.example.serveur.Entities.Patient;
import org.example.serveur.Entities.Statistiques;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StatistiquesRepository extends JpaRepository<Statistiques, String> {
    // Ajoutez des méthodes de requête si nécessaire
    Optional<Statistiques> findBySensorId(String SensorId);
}

