package ru.chigurov.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.chigurov.entities.FruitEntity;

@Repository
public interface FruitRepository extends JpaRepository<FruitEntity, Integer> {
}
