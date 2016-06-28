package game_engine.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by samskim on 6/28/16.
 */
public class GameState {

  private List<Player> players;
  private final long id;
  private String mapStr;

  public GameState(long id){
    this.id = id;
    players = new ArrayList<>();
  }

  public long getId(){
    return id;
  }

  public void setMap(String mapStr){
    this.mapStr = mapStr;
  }

  public String getMap(){
    return mapStr;
  }
}
