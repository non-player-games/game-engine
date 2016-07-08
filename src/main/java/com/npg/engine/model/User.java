package com.npg.engine.model;

/**
 * Created by samskim on 7/4/16.
 */

// User has a unique id
public class User {

  private long uid;

  public User(){}

  public User(long uid){
    this.uid = uid;
  }

  public long getUid() {
    return uid;
  }

  public void setUid(long uid) {
    this.uid = uid;
  }
}
