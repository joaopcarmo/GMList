package com.intensivao.gmlist.services;

import com.intensivao.gmlist.dto.GameDto;
import com.intensivao.gmlist.dto.GameListDto;
import com.intensivao.gmlist.dto.GameMinDto;
import com.intensivao.gmlist.entities.Game;
import com.intensivao.gmlist.entities.GameList;
import com.intensivao.gmlist.repositories.GameListRepository;
import com.intensivao.gmlist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDto> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDto(x)).toList();
    }
}
