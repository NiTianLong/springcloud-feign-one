package com.longe.controller;

import com.longe.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private ProviderService providerService;

    @RequestMapping("consumer")
    public String consumer(){

        return providerService.requestProviderService();
    }

}
