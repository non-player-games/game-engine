package com.npg.model.payload;

import java.util.List;

/**
 * Created by samskim on 7/20/16.
 */
public class ProcessMovePayloadReq {

  long gid;
  List<MoveRequest> moveRequests;

  public long getGid() {
    return gid;
  }

  public void setGid(long gid) {
    this.gid = gid;
  }

  public List<MoveRequest> getMoveRequests() {
    return moveRequests;
  }

  public void setMoveRequests(List<MoveRequest> moveRequests) {
    this.moveRequests = moveRequests;
  }
}
