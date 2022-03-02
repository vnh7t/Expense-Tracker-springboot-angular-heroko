package com.v2.expensetracker.ExpenseRackerRestServices.Entity;

import lombok.*;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter @NoArgsConstructor
public class Expense {


    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long  expenseID;
    private String expenceTitle;
    private String expenceContext;
    private String dateTime;
    public Expense(String expenceTitle, String expenceContext, String dateTime) {
        this.expenceTitle = expenceTitle;
        this.expenceContext = expenceContext;
        this.dateTime = dateTime;
    }
}
