package com.example.espn_api;

import com.example.espn_api.models.Game;
import com.example.espn_api.repositories.GameRepository;
import org.glassfish.jersey.server.ManagedAsync;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Component
@Path("/games")
public class GameController {

    @Inject
    GameRepository gameRepository;

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    @ManagedAsync
    public void getAll(@Suspended final AsyncResponse asyncResponse){
        List<Game> games = gameRepository.findAll();
        asyncResponse.resume(games);
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_JSON})
    @ManagedAsync
    public void getById(@Suspended final AsyncResponse asyncResponse, @PathParam("id") String id){

        asyncResponse.resume(gameRepository.getGameByGameId(id));
    }
}
