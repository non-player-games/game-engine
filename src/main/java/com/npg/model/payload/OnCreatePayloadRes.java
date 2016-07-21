package com.npg.model.payload;

/**
 * Created by samskim on 7/20/16.
 */
public class OnCreatePayloadRes extends Payload {
  private long gid;

  public OnCreatePayloadRes(long gid) {
    this.gid = gid;
  }

  public long getGid() {
    return gid;
  }

  public void setGid(long gid) {
    this.gid = gid;
  }
}
