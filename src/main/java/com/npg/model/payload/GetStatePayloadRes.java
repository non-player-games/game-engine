package com.npg.model.payload;

import com.npg.model.gameobj.GameState;

/**
 * Created by samskim on 7/20/16.
 */
public class GetStatePayloadRes extends Payload {
  private GameState gameState;

  public GameState getGameState() {
    return gameState;
  }

  public void setGameState(GameState gameState) {
    this.gameState = gameState;
  }
}
