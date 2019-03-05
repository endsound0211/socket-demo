package com.example.socket;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class OtherController {
    @RequestMapping("ya")
    public String ya(){
        return "ya";
    }
}
