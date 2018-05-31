package club.cheapok.boundary.web;

import club.cheapok.boundary.GameFactory;
import club.cheapok.entity.Player;
import club.cheapok.entity.Specification;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("game")
public class FirstPlayerAPI {
    @Inject
    public GameFactory gameFactory;

    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Player> whatever() {
        return gameFactory.getAllPlayers();
    }

    @GET
    @Path("iakaPlayer")
    @Produces(MediaType.APPLICATION_XML)
    public Player iakaPlayer() {
        return gameFactory.createPlayer(new Specification("Adrian", 28));
    }

    @POST
    @Path("addPlayer")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Response acceptAPlayer(Specification specification) {
        if (specification.getSpeed() < 5) {
            return Response.notModified().build();
        }
        Player player = gameFactory.createPlayer(specification);
        gameFactory.addPlayer(player);

        return Response.accepted().build();
    }
}
