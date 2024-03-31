package com.rahul.BankWebApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CardController {
        @GetMapping("/card")
        public String getCard(){
            return "This is card service";
        }
    }

