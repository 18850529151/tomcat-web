package com.weiwei.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author caiweide
 */
@Controller
public class ViewController {

    @RequestMapping("/home")
    public String m0() {
        return "home";
    }

}