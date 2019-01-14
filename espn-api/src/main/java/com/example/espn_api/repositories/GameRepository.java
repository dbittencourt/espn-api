package com.example.espn_api.repositories;

import com.example.espn_api.models.Game;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface GameRepository extends MongoRepository<Game, String> {
    public List<Game> findAll();
    public Game getGameById(String id);
    public Game getGameByGameId(String id);
}
