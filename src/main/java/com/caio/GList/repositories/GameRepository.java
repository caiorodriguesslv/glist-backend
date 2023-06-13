package com.caio.GList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caio.GList.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
