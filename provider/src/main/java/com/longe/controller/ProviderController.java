package com.longe.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @RequestMapping("provider")
    public String provider(){

        return "服务提供者......";
    }
}
