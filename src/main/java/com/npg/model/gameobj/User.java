package com.npg.model.gameobj;


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
  private Long uid;
  private String screenName;
  private String email;

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

  public Long getUid() {
    return uid;
  }

  public void setUid(Long uid) {
    this.uid = uid;
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
      "uid=" + uid +
      ", screenName='" + screenName + '\'' +
      ", email='" + email + '\'' +
      '}';
  }
}
