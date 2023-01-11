package com.lg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/lg")
public class MyController {
    @RequestMapping("/firstController")
    public String firstController(Model model){
        System.out.println("firstController");
          model.addAttribute("lg", "woshinidie");
        //springmvc配置文件配置了视图解析器前缀、后缀，所以可以不写前后缀路径
        return"login";
    }

}
