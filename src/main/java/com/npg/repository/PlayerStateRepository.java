package com.npg.repository;

import com.npg.model.gameobj.PlayerState;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by samskim on 7/20/16.
 */
public interface PlayerStateRepository extends CrudRepository<PlayerState, Long>{

  PlayerState findPlayerStateByGameStateIdAndUserId(long gid, long uid);
}
