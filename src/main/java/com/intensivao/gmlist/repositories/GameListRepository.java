package com.intensivao.gmlist.repositories;

import com.intensivao.gmlist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
