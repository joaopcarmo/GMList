package com.intensivao.gmlist.repositories;

import com.intensivao.gmlist.entities.Game;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
