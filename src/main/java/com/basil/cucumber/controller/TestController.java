package com.basil.cucumber.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by beldho on 5/28/2016.
 */
@Controller
public class TestController {

    @RequestMapping("/hello/{name}")
    @ResponseBody
    public String sampleController(@PathVariable("name") String s){
        return s;

    }
}
