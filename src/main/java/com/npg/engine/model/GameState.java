package com.npg.engine.model;

import java.util.ArrayList;
import java.util.List;

/**
<<<<<<< HEAD
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
=======
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
>>>>>>> 9782584997ced5c037e6c75756e2ce5e7442776b
  }

  public void addPlayer(Player player){
    this.players.add(player);
  }
<<<<<<< HEAD

=======
>>>>>>> 9782584997ced5c037e6c75756e2ce5e7442776b
}
