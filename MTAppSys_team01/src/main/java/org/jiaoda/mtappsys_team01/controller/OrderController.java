package org.jiaoda.mtappsys_team01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @GetMapping("/getOrderById")
    public String getOrderById(){
        return "getOrderById";
    }

    @GetMapping("/delOrderById")
    public String delOrderById(){
        return "delOrderById";
    }

}
