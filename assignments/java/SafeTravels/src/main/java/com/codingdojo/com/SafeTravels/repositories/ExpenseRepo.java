package com.codingdojo.com.SafeTravels.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.com.SafeTravels.models.Expense;

@Repository
public interface ExpenseRepo extends CrudRepository <Expense, Long>{
		List<Expense> findAll();
}
