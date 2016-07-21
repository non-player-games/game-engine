package com.npg.service;

import com.npg.model.gameobj.GameState;
import com.npg.model.gameobj.PlayerState;
import com.npg.model.gameobj.Position;
import com.npg.model.gameobj.User;
import com.npg.model.payload.MoveRequest;
import com.npg.model.payload.OnCreatePayloadReq;
import com.npg.repository.GameStateRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by samskim on 7/20/16.
 */
@Service
public class GameService {

  private static Logger logger = LoggerFactory.getLogger(GameService.class);

  private GameStateRepository gameStateRepository;
  private UserService userService;
  private PlayerStateService playerStateService;

  @Autowired
  public GameService(GameStateRepository gameStateRepository, UserService userService, PlayerStateService playerStateService) {
    this.gameStateRepository = gameStateRepository;
    this.userService = userService;
    this.playerStateService = playerStateService;
  }

  public Long createGame(OnCreatePayloadReq payload) {
    List<PlayerState> playerStates = new ArrayList<>();
    for (Long uid: payload.getUids()){
      PlayerState playerState = new PlayerState();

      // will throw an exception if a user is not found
      User user = userService.findById(uid);
      playerState.setUser(user);
      playerState.setPosition(new Position(0,0));
      playerStates.add(playerState);
    }

    GameState state = gameStateRepository.save(new GameState(playerStates));

    // persist gamestate id to playerstates
    for (PlayerState ps: playerStates) ps.setGameState(state);

    // persist playerstates
    playerStateService.save(playerStates);
    return state.getId();

  }

  public GameState findByGid(long gid) {
    logger.info("GameService: findByGid for gid: " + gid);
    return gameStateRepository.findOne(gid);
  }

  public GameState findByGidAndUid(long gid, long uid) {
    return gameStateRepository.findGameStateByIdAndPlayerStatesUserId(gid, uid);
  }

  public GameState getProcessedState(GameState gameState, List<MoveRequest> moveRequests) {
    return null;
  }


}
