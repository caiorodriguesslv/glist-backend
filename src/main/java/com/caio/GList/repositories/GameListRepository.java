package com.caio.GList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caio.GList.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
