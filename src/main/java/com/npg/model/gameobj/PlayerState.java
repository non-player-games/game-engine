package com.npg.model.gameobj;


import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by samskim on 7/20/16.
 */
@Entity
public class PlayerState {

  @Id
  @GeneratedValue
  private Long id;

  @ManyToOne
  private User user;

  @Embedded
  private Position position;

  @ManyToOne
  private GameState gameState;

  public PlayerState() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Position getPosition() {
    return position;
  }

  public void setPosition(Position position) {
    this.position = position;
  }

  public GameState getGameState() {
    return gameState;
  }

  public void setGameState(GameState gameState) {
    this.gameState = gameState;
  }
}
