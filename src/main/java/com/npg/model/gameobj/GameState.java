package com.npg.model.gameobj;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Created by samskim on 7/20/16.
 */
@Entity
public class GameState extends State {

  @Id
  @GeneratedValue
  private Long id;

  @OneToMany (mappedBy = "gameState")
  List<PlayerState> playerStates;

  public GameState() {
  }

  public GameState(List<PlayerState> playerStates) {
    this.playerStates = playerStates;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public List<PlayerState> getPlayerStates() {
    return playerStates;
  }

  public void setPlayerStates(List<PlayerState> playerStates) {
    this.playerStates = playerStates;
  }
}
