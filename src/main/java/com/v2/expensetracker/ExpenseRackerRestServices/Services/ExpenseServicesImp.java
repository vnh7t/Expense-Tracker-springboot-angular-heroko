package com.v2.expensetracker.ExpenseRackerRestServices.Services;

import com.v2.expensetracker.ExpenseRackerRestServices.Entity.Expense;
import com.v2.expensetracker.ExpenseRackerRestServices.Repositories.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExpenseServicesImp implements ExpenseServices{
    @Autowired
    ExpenseRepository expenseRepository;
    @Override
    public Expense creatingExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    @Override
    public List<Expense> allExpences() {
        return expenseRepository.findAll();
    }

    @Override
    public Expense updatingExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    @Override
    public List<Expense> deletingExpense(Long id) {
         expenseRepository.deleteById(id);
        return this.allExpences();
    }

    @Override
    public Optional<Expense> expandedExpences(Long id) {
        return expenseRepository.findById(id);
    }


}
