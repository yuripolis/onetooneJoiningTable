package com.example.joinedTable.controller;


import com.example.joinedTable.model.Customer;
import com.example.joinedTable.model.Item;
import com.example.joinedTable.repository.itemrepo;
import com.example.joinedTable.repository.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controller {

    @Autowired
    private itemrepo itemR;

    @Autowired
    private repository cusrepo;

    @GetMapping("/")
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }

    @PostMapping("/")
    public ModelAndView add(){
        ModelAndView mv = new ModelAndView("index");
        Item item = new Item();

        item.setName("item1");
        Customer cus = new Customer();

        cus.setName("yuri");
        cus.setItem(item);
        this.cusrepo.save(cus);
        System.out.println("added");

        return mv;
    }

}
