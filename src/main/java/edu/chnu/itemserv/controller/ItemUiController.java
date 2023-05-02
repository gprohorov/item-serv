package edu.chnu.itemserv.controller;
/*
  @author   george
  @project   item-serv
  @class  ItemUiController
  @version  1.0.0 
  @since 02.05.23 - 10.07
*/

import edu.chnu.itemserv.model.Item;
import edu.chnu.itemserv.service.impls.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/ui/v1/items")
 public class ItemUiController {

    @Autowired
    ItemServiceImpl service;


    @GetMapping("/")
    public String getAllItems(Model model){
        model.addAttribute("items", service.getAll());
        return "items";
    }


}
