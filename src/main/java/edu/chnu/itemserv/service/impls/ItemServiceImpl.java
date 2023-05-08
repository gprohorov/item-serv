package edu.chnu.itemserv.service.impls;
/*
  @author   george
  @project   item-serv
  @class  ItemServiceImpl
  @version  1.0.0 
  @since 26.04.23 - 10.58
*/

import edu.chnu.itemserv.model.Item;
import edu.chnu.itemserv.repository.ItemRepository;
import edu.chnu.itemserv.service.interfaces.IItemService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class ItemServiceImpl implements IItemService {
    private LocalDateTime now = LocalDateTime.now();
    private List<Item>  items = new ArrayList<>(
            Arrays.asList(
                    new Item("1", "name1","desc1",now, now),
                    new Item("2", "name2","desc2",now, now),
                    new Item("3", "name3","desc3",now, now),
                    new Item( "name4","desc4")
            )
    );

    @Autowired
    ItemRepository repository;

   //@PostConstruct
    public void init(){
        repository.saveAll(items);
    }

    @Override
    public Item create(Item item) {
        item.setCreatedAt(LocalDateTime.now());
        return repository.save(item);
    }

    @Override
    public Item get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Item update(Item item) {
        String id = item.getId();
        Item toUpdate = this.get(id);
        item.setCreatedAt(toUpdate.getCreatedAt());
        item.setUpdatedAt(LocalDateTime.now());
        return repository.save(item);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<Item> getAll() {
        return repository.findAll();
    }


}
