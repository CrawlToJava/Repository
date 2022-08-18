package repository;

import entity.Scooters;


import java.util.List;
import java.util.Optional;

public interface ScootersRepository {
    void save(Scooters scooter);

    void delete(Long id);

    void update(Long id, Scooters scooter);

    Optional<Scooters> findById(Long id);

    List<Scooters> findAll();
}
