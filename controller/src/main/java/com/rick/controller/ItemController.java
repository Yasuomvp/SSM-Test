package com.rick.controller;

import com.rick.domain.Item;
import com.rick.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("/showItem/{name}")
    public ModelAndView findByName(@PathVariable("name") String name, ModelAndView modelAndView){
        System.out.println("111");
        Item item = itemService.findByName(name);
        modelAndView.addObject("item",item);
        modelAndView.setViewName("item");
        return modelAndView;
    }
}
