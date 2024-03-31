package com.rahul.BankWebApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {
        @GetMapping("/balance")
        public String getBalance(){
            return "This is balance service";
        }
    }


