package edu.chnu.itemserv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
  @author   george
  @project   item-serv
  @class  HelloController
  @version  1.0.0 
  @since 03.05.23 - 19.30
*/
@Controller
    public class HelloController {

    @RequestMapping("/hello")
    String getHello(){
        return "hello";
    }
}
