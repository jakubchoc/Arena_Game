package com.example.gladiator.Repositories;

import com.example.gladiator.Models.Gladiator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BattleRepository extends JpaRepository<Gladiator, Integer> {

    Gladiator findByLevel(int level);

    Gladiator findById(int id);
}
