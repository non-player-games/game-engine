package com.npg.model.payload;

/**
 * Created by samskim on 7/17/16.
 */
public class GetStatePayloadReq extends Payload{

  private long gid;
  private long uid;

  public long getGid() {
    return gid;
  }

  public void setGid(long gid) {
    this.gid = gid;
  }

  public long getUid() {
    return uid;
  }

  public void setUid(long uid) {
    this.uid = uid;
  }
}
