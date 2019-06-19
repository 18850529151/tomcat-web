package com.weiwei.web;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author caiweide
 */
@RestController
public class TestController {

    @RequestMapping("/0")
    public String m0() {
        return "default ->" + System.currentTimeMillis();
    }


}