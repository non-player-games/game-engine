package com.npg.engine.controller;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.npg.engine.database.MongoDBInstance;
import com.npg.engine.model.GameState;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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

  @GET
  @Path("/init")
  @Produces("application/json")
  public GameState initGame() {
    MongoDBInstance dbInstance = MongoDBInstance.getInstance();
    MongoDatabase db = dbInstance.getDb();
    MongoCollection collection = db.getCollection("collectionName");

    state = new GameState(serial);
    return state;
  }

  @GET
  @Path("/action/{move}")
  @Produces("application/json")
  public GameState action(@PathParam("move") String move){

    String mapStr = state.getMapStr();
    String[] rows = mapStr.split(";");
    //|x| | | | |;| | | | | |;| | | | |o|

    for (String row: rows){
      String[] r = row.split("|");
    }
    return null;
  }



}
