package com.npg.engine.logics;

import com.npg.engine.model.Player;
import com.npg.engine.model.Position;

import java.util.List;

/**
 * Created by samskim on 6/30/16.
 */
public class GameUtil {

  public static GameUtil util;

  public GameUtil(){}

  public static GameUtil getInstance(){
    if (util == null){
      util = new GameUtil();
    }
    return util;
  }

  // print the map string in console
  public String[][] mapstrToArray(String mapStr){
    String[] rows = mapStr.split(";");
    String[][] gameMap = new String[rows.length][rows[0].length()];

    for (int i = 0; i < rows.length; i++){

      gameMap[i] = rows[i].split("\\|");

    }
    return gameMap;
  }

  public void printGameMap(String[][] gameMap){

    System.out.print(" ");
    for (int i = 0; i < gameMap[0].length; i++){
      System.out.print("  " + i);
    }
    System.out.println();

    for (int i = 0; i < gameMap.length; i++) {

      System.out.print(i);
      for (int j = 0; j < gameMap[i].length; j++) {
        System.out.print("|" + gameMap[i][j]);
      }

      System.out.println("|");
    }
  }

  public Player getPlayer(long pid, List<Player> players){
    for (Player player: players){
      if (player.getId() == pid) return player;
    }
    return null;
  }

  public Position getMovedPosition(Position pos, String move){
    Position newPos;
    if (move.equalsIgnoreCase("w")){
      newPos = new Position(pos.getX() - 1, pos.getY());
    }else if (move.equalsIgnoreCase("e")){
      newPos = new Position(pos.getX() + 1 , pos.getY());
    }else if (move.equalsIgnoreCase("n")){
      newPos = new Position(pos.getX(), pos.getY() - 1);
    }else if (move.equalsIgnoreCase("s")){
      newPos = new Position(pos.getX(), pos.getY() + 1);
    }else{
      return null;
    }
    return newPos;
  }

  public String arrayToMapstr(String[][] array){

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < array.length; i++){
      for (int j = 0; j < array[i].length; j++){
        String tile = array[i][j];

        sb.append(tile);
        if (j != array[i].length - 1){
          sb.append("|");
        }
      }
      if (i != array.length){
        sb.append(";");
      }
    }

    return sb.toString();
  }
}
