package com.npg.engine.model;

/**
 * Created by samskim on 6/28/16.
 */
public class Player {


  private long id;
  private int elo;

  public Player(long id){
    this.id = id;
  }

  public Player(long id, int elo){
    this.id = id;
    this.elo = elo;
  }

  public long getId(){
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public int getElo() {
    return elo;
  }

  public void setElo(int elo) {
    this.elo = elo;
  }
}


