package com.npg.model.gameobj;

/**
 * Created by samskim on 7/4/16.
 */
public class Position {

  private int x, y;

  public Position(){}

  public Position(int x, int y){
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }
}
