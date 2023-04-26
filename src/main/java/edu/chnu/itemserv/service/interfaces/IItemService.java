package edu.chnu.itemserv.service.interfaces;
/*
  @author   george
  @project   item-serv
  @class  IItemService
  @version  1.0.0 
  @since 26.04.23 - 10.50
*/

import edu.chnu.itemserv.model.Item;

import java.util.List;

public interface IItemService {

        // CRUD create read update delete

        Item create(Item item);
        Item get(String id);
        Item update(Item item);
        void delete(String id);
        List<Item> getAll();

}
