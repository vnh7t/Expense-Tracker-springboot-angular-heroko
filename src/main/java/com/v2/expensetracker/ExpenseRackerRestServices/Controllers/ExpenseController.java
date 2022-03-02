package com.v2.expensetracker.ExpenseRackerRestServices.Controllers;

import com.v2.expensetracker.ExpenseRackerRestServices.Entity.Expense;
import com.v2.expensetracker.ExpenseRackerRestServices.Services.ExpenseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class ExpenseController {

    @Autowired
    private ExpenseServices expenseService;
    @GetMapping("/displayUserExpenses")
    public List<Expense> expenseHistory(){
        return expenseService.allExpences();
    }
    @GetMapping("/detailOfExpense")
    public Optional<Expense> detailExpense(@RequestParam Long id){
        return expenseService.expandedExpences(id);
    }
    @PostMapping("/addingExpense")
    public Expense createExpense(@RequestBody Expense expense){
        return expenseService.creatingExpense(expense);
    }
    @PutMapping("/updatingExpense")
    public Expense updateExpense(@RequestBody Expense expense){
        return expenseService.updatingExpense(expense);
    }
    @DeleteMapping("/deleteExpense")
    public List<Expense> DeletingExpense(@RequestParam Long Id){
        return expenseService.deletingExpense(Id);
    }
}
