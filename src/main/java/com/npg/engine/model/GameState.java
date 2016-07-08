package com.npg.engine.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by samskim on 7/4/16.
 */
public class GameState {

  private long id;
  private List<Player> players;
  private String[][] mapArray;

  public GameState(long id, String[][] mapArray) {
    this.id = id;
    players = new ArrayList<>();
    this.mapArray = mapArray;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public List<Player> getPlayers() {
    return players;
  }

  public void setPlayers(List<Player> players) {
    this.players = players;
  }

  public String[][] getMapArray() {
    return mapArray;
  }

  public void setMapArray(String[][] mapArray) {
    this.mapArray = mapArray;
  }

  public void addPlayer(Player player){
    this.players.add(player);
  }

}
