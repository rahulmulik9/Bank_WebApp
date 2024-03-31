package com.rahul.BankWebApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {
    @GetMapping("/loan")
    public String getLoans(){
        return "This is loan service";
    }
}
