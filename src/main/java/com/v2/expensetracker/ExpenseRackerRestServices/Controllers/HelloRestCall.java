package com.v2.expensetracker.ExpenseRackerRestServices.Controllers;

import lombok.Generated;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloRestCall {
    @RequestMapping("/")
    public String greetingMessage(){
        return "Good Morning";
    }

}
