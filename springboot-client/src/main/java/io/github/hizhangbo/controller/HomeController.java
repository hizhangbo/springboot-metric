package io.github.hizhangbo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Bob
 * @date 2020-03-14 11:01
 */
@RestController
@RequestMapping
public class HomeController {

    @GetMapping
    public String index(){
        return "index";
    }
}
