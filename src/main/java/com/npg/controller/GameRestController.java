package com.npg.controller;

import com.npg.model.gameobj.GameState;
import com.npg.model.payload.GetStatePayloadReq;
import com.npg.model.payload.MoveRequest;
import com.npg.model.payload.OnCreatePayloadReq;
import com.npg.model.payload.OnCreatePayloadRes;
import com.npg.model.payload.ProcessMovePayloadReq;
import com.npg.service.GameService;
import com.npg.service.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by samskim on 7/20/16.
 */
@RestController @RequestMapping("/api/v1/game")
public class GameRestController {

  private static final Logger logger = LoggerFactory.getLogger(GameRestController.class);

  private GameService gameService;
  private UserService userService;

  @Autowired
  public GameRestController(GameService g, UserService u){
    gameService = g;
    userService = u;
  }

  @RequestMapping("/hello")
  public String hello(){
    return "this is a test";
  }

  @RequestMapping("/action/onCreate")
  public OnCreatePayloadRes onCreate(@RequestBody OnCreatePayloadReq payload){
    long id = gameService.createGame(payload);
    return new OnCreatePayloadRes(id);
  }

  // just return global GameState for now
  // TODO: Return GameState that is only visible to the user
  @RequestMapping("/action/getState")
  public GameState getState(@RequestBody GetStatePayloadReq payload){
    logger.info("Server getState executed with payload gid: " + payload.getGid());

    if (payload.getUid() == 0){
      return gameService.findByGid(payload.getGid());
    }else{
      return gameService.findByGidAndUid(payload.getGid(), payload.getUid());
    }
  }

  @RequestMapping("/action/processMoves")
  public GetStatePayloadReq processMoves(@RequestBody ProcessMovePayloadReq payload){
    GameState gameState = gameService.findByGid(payload.getGid());
    List<MoveRequest> moveRequests = payload.getMoveRequests();

    // get next processed state
    GameState processedState = gameService.getProcessedState(gameState, moveRequests);
    return null;
  }

}
