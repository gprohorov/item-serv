package edu.chnu.itemserv.repository;

import edu.chnu.itemserv.model.Item;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/*
  @author   george
  @project   item-serv
  @class  ItemRepository
  @version  1.0.0 
  @since 26.04.23 - 11.51
*/
@Repository
    public interface ItemRepository extends MongoRepository<Item, String> {
}
