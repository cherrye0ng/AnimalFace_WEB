package com.project.animalface_web.repository;

import com.project.animalface_web.domain.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
