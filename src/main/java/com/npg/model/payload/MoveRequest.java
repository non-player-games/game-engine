package com.npg.model.payload;

import com.npg.model.enums.Move;

/**
 * Created by samskim on 7/21/16.
 */
public class MoveRequest {

  private long uid;
  private Move move;

  public long getUid() {
    return uid;
  }

  public void setUid(long uid) {
    this.uid = uid;
  }

  public Move getMove() {
    return move;
  }

  public void setMove(Move move) {
    this.move = move;
  }
}
