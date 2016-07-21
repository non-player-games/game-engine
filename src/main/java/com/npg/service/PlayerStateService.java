package com.npg.service;

import com.npg.model.gameobj.PlayerState;
import com.npg.repository.GameStateRepository;
import com.npg.repository.PlayerStateRepository;
import com.npg.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by samskim on 7/20/16.
 */
@Service
public class PlayerStateService {

  private PlayerStateRepository playerStateRepository;
  private GameStateRepository gameStateRepository;
  private UserRepository userRepository;

  @Autowired
  public PlayerStateService(PlayerStateRepository playerStateRepository, GameStateRepository gameStateRepository, UserRepository userRepository) {
    this.playerStateRepository = playerStateRepository;
    this.gameStateRepository = gameStateRepository;
    this.userRepository = userRepository;
  }


  public void save(List<PlayerState> playerStates) {
    playerStateRepository.save(playerStates);
  }
}
