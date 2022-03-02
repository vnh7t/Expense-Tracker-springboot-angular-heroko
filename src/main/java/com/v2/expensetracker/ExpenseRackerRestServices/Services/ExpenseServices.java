package com.v2.expensetracker.ExpenseRackerRestServices.Services;

import com.v2.expensetracker.ExpenseRackerRestServices.Entity.Expense;

import java.util.List;
import java.util.Optional;

public interface ExpenseServices {
    public Expense creatingExpense(Expense expense);

    public List<Expense> allExpences();


    public Expense updatingExpense(Expense expense);

    public List<Expense> deletingExpense(Long id);

    public Optional<Expense> expandedExpences(Long id);
}
