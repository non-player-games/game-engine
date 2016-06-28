package game_engine.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import game_engine.model.GameState;


/**
 * Created by samskim on 6/28/16.
 */

@RestController
public class GameController {

  private long serial = 1;

  @RequestMapping(value = "api/v1/state/init", method = RequestMethod.POST)
  public long initGame(){

    GameState gameState = new GameState(serial);
    return serial++;
  }

  @RequestMapping(value = "api/v1/state", method = RequestMethod.GET)
  public GameState getState(@RequestParam("gid") long gid,
                            @RequestParam("pid") long pid){

    GameState state = new GameState(1);
    state.setMap("| | | | |\n| |x| | |\n| |x| | |");
    return state;
  }

}
