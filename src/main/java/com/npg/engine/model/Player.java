package com.npg.engine.model;

/**
 * Created by samskim on 6/28/16.
 */

// Player is a temporary instance of a User inside a game
public class Player {

  // id is player's unique id
  private int id;

  // num is player's number inside a game
  private int num;
  private Position position;

  public Player(int id){
    this.id = id;
  }

  public Player(int id, int num, Position position){
    this.id = id;
    this.num = num;
    this.position = position;
  }

  public int getId(){
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Position getPosition() {
    return position;
  }

  public void setPosition(Position position) {
    this.position = position;
  }

  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
  }
}


