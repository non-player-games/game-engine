package com.npg.service;

import com.npg.model.gameobj.User;
import com.npg.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by samskim on 7/20/16.
 */
@Service
public class UserService {

  private UserRepository userRepository;

  @Autowired
  public UserService(UserRepository u){
    userRepository = u;
  }


  public void save(User u) {
    userRepository.save(u);
  }

  public User findById(Long id) {
    return userRepository.findOne(id);
  }
}
