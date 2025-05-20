package com.intensivao.gmlist.controllers;

import com.intensivao.gmlist.dto.GameDto;
import com.intensivao.gmlist.dto.GameListDto;
import com.intensivao.gmlist.dto.GameMinDto;
import com.intensivao.gmlist.services.GameListService;
import com.intensivao.gmlist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDto> findAll(){
        List<GameListDto> result = gameListService.findAll();
        return result;
    }
}
