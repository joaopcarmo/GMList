package com.intensivao.gmlist.services;

import com.intensivao.gmlist.dto.GameMinDto;
import com.intensivao.gmlist.entities.Game;
import com.intensivao.gmlist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDto> findAll() {
        List<Game> result = gameRepository.findAll();
        // Converte cada Game para GameMinDto usando stream e mapeamento
        List<GameMinDto> dto = result.stream().map(x -> new GameMinDto(x)).toList();
        // Retorna a lista de DTOs para ser usada em camadas superiores (ex: controller)
        return dto;
    }
}
