package com.npg.service;

import com.npg.model.gameobj.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by samskim on 7/20/16.
 */
@Component
public class DataLoader {

  private GameService gameService;
  private UserService userService;

  @Autowired
  public DataLoader(GameService gameService, UserService userService) {
    this.gameService = gameService;
    this.userService = userService;
  }

  @PostConstruct
  public void loadData(){
    User u1 = new User("sam", "sam@email.com");
    User u2 = new User("eric", "eric@email.com");
    User u3 = new User("tony", "tony@email.com");

    userService.save(u1);
    userService.save(u2);
    userService.save(u3);

  }

}
