package com.npg.model.gameobj;


import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Created by samskim on 7/4/16.
 */
@Entity
public class User {

  @Id
  @GeneratedValue
  private Long id;
  private String screenName;
  private String email;

  @JsonIgnore
  @OneToMany(mappedBy = "user")
  private List<PlayerState> playerState;

  public User(){}

  public User(String screenName){
    this.screenName = screenName;
  }

  public User(String screenName, String email) {
    this.screenName = screenName;
    this.email = email;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getScreenName() {
    return screenName;
  }

  public void setScreenName(String screenName) {
    this.screenName = screenName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public List<PlayerState> getPlayerState() {
    return playerState;
  }

  public void setPlayerState(List<PlayerState> playerState) {
    this.playerState = playerState;
  }

  @Override
  public String toString() {
    return "User{" +
      "id=" + id +
      ", screenName='" + screenName + '\'' +
      ", email='" + email + '\'' +
      '}';
  }
}
