package com.npg.engine.controller;

import com.npg.engine.database.GameCache;
import com.npg.engine.logics.GameLogic;
import com.npg.engine.logics.GameUtil;
import com.npg.engine.model.GameState;
import com.npg.engine.model.Player;
import com.npg.engine.model.Position;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

/**
 * Created by samskim on 7/3/16.
 */

@Path("/game")
public class GameStateController {

  GameCache cache = GameCache.getInstance();
  GameLogic logic = GameLogic.getInstance();
  GameUtil util = GameUtil.getInstance();

  @GET
  @Path("/init")
  @Produces("application/json")
  public GameState initGame() {

    long serial = cache.getLastSerial() + 1;

    String mapStr =
      "1x|w_|__|__|__|__;" +
        "__|w_|__|__|__|__;" +
        "__|w_|__|w_|__|__;" +
        "__|w_|__|w_|__|__;" +
        "__|__|__|w_|__|0x";

    String[][] mapArray = util.mapstrToArray(mapStr);
    GameState state = new GameState(serial, mapArray);

    Player p1 = new Player(1000, 1, new Position(0,0));
    state.addPlayer(p1);

    cache.saveState(serial, state);
    return state;
  }

  //throw new WebApplicationException(num);

  @GET
  @Path("/move")
  @Produces("application/json")
  public String move(@QueryParam("gid") long gid, @QueryParam("pid") int pid, @QueryParam("move") String move){
    GameState state = cache.getState(gid);

    GameState movedState = logic.move(state, pid, move);

    cache.saveState(gid, movedState);

    return getMapString(movedState);
  }

  @GET
  @Path("/print/{gid}")
  @Produces("text/plain")
  public String printState(@PathParam("gid") long gid){

    GameState state = cache.getState(gid);
    return getMapString(state);
  }

  @GET
  @Path("/{gid}")
  @Produces("application/json")
  public GameState getState(@PathParam("gid") long gid){
    return cache.getState(gid);
  }

  public String getMapString(GameState state){
    String[][] mapArray = state.getMapArray();
    String mapStr = util.arrayToMapstr(mapArray);
    return mapStr.replaceAll(";", "\n");
  }
}
