package com.intensivao.gmlist.services;

import com.intensivao.gmlist.dto.GameDto;
import com.intensivao.gmlist.dto.GameMinDto;
import com.intensivao.gmlist.entities.Game;
import com.intensivao.gmlist.projections.GameMinProjection;
import com.intensivao.gmlist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDto findById(Long id){
        Game result = gameRepository.findById(id).get();
        return new GameDto(result);
    }


    @Transactional(readOnly = true)
    public List<GameMinDto> findAll() {
        List<Game> result = gameRepository.findAll();
        // Converte cada Game para GameMinDto usando stream e mapeamento
        return result.stream().map(x -> new GameMinDto(x)).toList();
        // Retorna a lista de DTOs para ser usada em camadas superiores (ex: controller)
    }

    @Transactional(readOnly = true)
    public List<GameMinDto> findByList(Long listId) {
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(x -> new GameMinDto(x)).toList();

    }
}
