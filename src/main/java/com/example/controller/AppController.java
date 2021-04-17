package com.example.controller;

import com.example.domain.Product;
import com.example.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;


@Component
@Controller
public class AppController {

    Logger logger = LoggerFactory.getLogger(AppController.class);


    @Autowired
    private ProductService service;


    @RequestMapping("/")
    public String viewHomePage(Model model) {
        List<Product> productList = service.listAll();
//        logger.error(productList.toString());
        model.addAttribute("productList", productList);
        return "index";
    }


}
