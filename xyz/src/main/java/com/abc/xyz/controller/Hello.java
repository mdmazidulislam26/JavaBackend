package com.abc.xyz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class Hello {
    @GetMapping("/")
  public String hello() {
    return "hello";
  }
}
