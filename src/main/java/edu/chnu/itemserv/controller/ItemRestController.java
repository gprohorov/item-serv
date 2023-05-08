package edu.chnu.itemserv.controller;

import edu.chnu.itemserv.model.Item;
import edu.chnu.itemserv.service.impls.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
  @author   george
  @project   item-serv
  @class  ItemRestController
  @version  1.0.0 
  @since 25.04.23 - 10.51
*/
@RestController
@RequestMapping("/api/v1/items")
    public class ItemRestController {

    @Autowired
    ItemServiceImpl service;

    @GetMapping("/hello")
    public String getHello(){
        return "HELLO!!!!!!!!!!!!!";
    }

    @GetMapping("/")
    public List<Item> getAllItems(){
        return service.getAll();
    }
    @DeleteMapping ("/{id}")
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    // GET POST PUT DELETE

    

}
