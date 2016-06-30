package com.npg.engine.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by samskim on 6/28/16.
 */
public class GameState {


  private long id;
  private List<Player> players;
  private String mapStr;


  public GameState(long id){
    this.id = id;
    players = new ArrayList<>();
    this.mapStr = "|x| | | | |;| | | | | |;| | | | |o|";
  }

  public long getId(){
    return id;
  }

  public void setMapStr(String mapStr){
    this.mapStr = mapStr;
  }

  public String getMapStr(){
    return mapStr;
  }

  public void setPlayers(List<Player> players){
    this.players = players;
  }

  public List<Player> getPlayers(){
    return players;
  }

  public void addPlayer(Player player){
    this.players.add(player);
  }
}
