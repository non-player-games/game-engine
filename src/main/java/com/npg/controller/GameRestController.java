package com.npg.controller;

import com.npg.model.payload.GetStatePayloadReq;
import com.npg.model.payload.OnCreatePayloadReq;
import com.npg.model.payload.OnCreatePayloadRes;
import com.npg.service.GameService;
import com.npg.service.UserService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by samskim on 7/20/16.
 */
@RestController @RequestMapping("/api/v1/game")
public class GameRestController {

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

  @RequestMapping("/action/getState")
  public GetStatePayloadReq getState(){

    return null;
  }

  @RequestMapping("/action/processMoves")
  public GetStatePayloadReq processMoves(){
    return null;
  }

}
