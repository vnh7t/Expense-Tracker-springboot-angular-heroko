package com.v2.expensetracker.ExpenseRackerRestServices.Repositories;

import com.v2.expensetracker.ExpenseRackerRestServices.Entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense,Long> {
}
