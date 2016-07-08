package com.npg.engine.controller;

<<<<<<< HEAD
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
=======
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.npg.engine.database.MongoDBInstance;
import com.npg.engine.model.GameState;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by samskim on 6/29/16.
 */
@Path("/state")
public class GameStateController {

  long serial = 1;
  final String collectionName = "GameStates";
  GameState state;

//  @GET
//  @Path("/addPlayer/{pid}")
//  @Produces("application/json")
//  public long addPlayer(@PathParam("pid") long pid){
//
//    MongoDBInstance dbInstance = MongoDBInstance.getInstance();
//    MongoDatabase db = dbInstance.getDb();
//    MongoCollection collection = db.getCollection("collectionName");
//
//    GameState state = new GameState(serial);
//
//    FindIterable<Document> iterable = collection.find(new Document("id", serial));
//
//    if (iterable.first() != null){
//      Document doc = iterable.first();
//
//      state.setMapStr((String) doc.get("mapStr"));
//
//      List<Player> players = new ArrayList<>();
//
//      List<Document> playersDoc = (List<Document>) doc.get("players");
//      if (!playersDoc.isEmpty()){
//        for (Document playerDoc: playersDoc){
//
//          Player player = new Player((long) playerDoc.get("id"), (int) playerDoc.get("elo"));
//          players.add(player);
//        }
//      }
//
//      players.add(new Player(pid));
//    }
//
//
//    collection.insertOne(state);
//
//    return state.getId();
//  }
>>>>>>> 9782584997ced5c037e6c75756e2ce5e7442776b

  @GET
  @Path("/init")
  @Produces("application/json")
  public GameState initGame() {
<<<<<<< HEAD

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
=======
    MongoDBInstance dbInstance = MongoDBInstance.getInstance();
    MongoDatabase db = dbInstance.getDb();
    MongoCollection collection = db.getCollection("collectionName");

    state = new GameState(serial);
    return state;
  }

//  @GET
//  @Path("/action/{move}")
//  @Produces("application/json")
//  public GameState action(@PathParam("move") String move){
//
//    String mapStr = state.getMapStr();
//    String[] rows = mapStr.split(";");
//    //|x| | | | |;| | | | | |;| | | | |o|
//
//    for (String row: rows){
//      String[] r = row.split("|");
//    }
//    return null;
//  }



>>>>>>> 9782584997ced5c037e6c75756e2ce5e7442776b
}
