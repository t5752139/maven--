package it.cast.controller;


import it.cast.domian.Items;
import it.cast.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
  private ItemsService itemsService;
    @RequestMapping("/show")
    public String show(Model model){
        Items items = itemsService.fandId(1);
        model.addAttribute("item",items);
        return "itemDetail";

    }
    public void save(){}



}
