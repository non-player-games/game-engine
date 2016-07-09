package com.npg.engine.logics;

import com.npg.engine.model.GameState;
import com.npg.engine.model.Player;
import com.npg.engine.model.Position;

import java.util.List;

/**
 * Created by samskim on 6/30/16.
 */
public class GameLogic {

  // logic instance
  public static GameLogic logic;

  // utility instance
  private GameUtil util;

  public GameLogic(){
    util = GameUtil.getInstance();
  }

  public static GameLogic getInstance(){
    if (logic == null){
      logic = new GameLogic();
    }
    return logic;
  }

  public GameState move(GameState state, long pid, String move){

    List<Player> players = state.getPlayers();
    String[][] mapArray = state.getMapArray();

    Player player = util.getPlayer(pid, players);
    if (player == null) return null;

    Position currentPos = player.getPosition();
    Position newPos = util.getMovedPosition(currentPos, move);
    player.setPosition(newPos);

    String[][] newMapArray = mapArray.clone();
    newMapArray[newPos.getY()][newPos.getX()] = String.valueOf(player.getNum()) + "x";
    newMapArray[currentPos.getX()][currentPos.getY()] = "__";

    state.setMapArray(newMapArray);
    state.setPlayers(players);

    return state;
  }

}
