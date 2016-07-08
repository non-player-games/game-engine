package com.npg.engine.database;

import com.npg.engine.model.GameState;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by samskim on 6/30/16.
 */
public class GameCache {

  private static Map<Long, GameState> states;
  private static GameCache gameCache;
  private static long serial;

  private GameCache(){
    serial = 1;
    states = new HashMap<>();
  }

  public static GameCache getInstance(){
    if (gameCache == null){
      gameCache = new GameCache();
    }
    return gameCache;
  }

  public GameState getState(long id){
    return states.get(id);
  }

  public GameState saveState(long id, GameState state){
    return states.put(id, state);
  }

  public long getLastSerial(){
    return serial - 1;
  }

  public boolean hasState(long id){
    return states.containsKey(id);
  }
}
