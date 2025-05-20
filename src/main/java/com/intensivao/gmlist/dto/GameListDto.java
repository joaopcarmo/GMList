package com.intensivao.gmlist.dto;

import com.intensivao.gmlist.entities.GameList;
import org.springframework.beans.BeanUtils;

public class GameListDto {

    private Long id;
    private String name;

    public GameListDto() {}

    public GameListDto(GameList entity) {
        BeanUtils.copyProperties(entity, this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
