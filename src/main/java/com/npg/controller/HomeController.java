package com.npg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by samskim on 7/17/16.
 */
@Controller
public class HomeController {

  @RequestMapping("/")
  public String home(){
    return "index";
  }



}
