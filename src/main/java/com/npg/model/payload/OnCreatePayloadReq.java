package com.npg.model.payload;

import java.util.List;

/**
 * Created by samskim on 7/17/16.
 */
public class OnCreatePayloadReq extends Payload {

  private List<Long> uids;

  public List<Long> getUids() {
    return uids;
  }

  public void setUids(List<Long> uids) {
    this.uids = uids;
  }
}