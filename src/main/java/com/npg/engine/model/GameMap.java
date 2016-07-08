package com.npg.engine.model;

/**
 * Created by samskim on 7/4/16.
 */
public class GameMap {

  private String mapStr;

  public GameMap(String mapStr){
    this.mapStr = mapStr;
  }

  public String getMapStr() {
    return mapStr;
  }

  public void setMapStr(String mapStr) {
    this.mapStr = mapStr;
  }
}
