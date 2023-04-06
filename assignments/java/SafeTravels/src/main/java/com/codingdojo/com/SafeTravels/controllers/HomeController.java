package com.codingdojo.com.SafeTravels.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.codingdojo.com.SafeTravels.models.Expense;
import com.codingdojo.com.SafeTravels.services.ExpenseServ;

@Controller
public class HomeController {

	@Autowired
	ExpenseServ expenseServ;
	
	@GetMapping("/")
	public String index(@ModelAttribute("expense") Expense expense, Model model) {
		model.addAttribute("allExpenses", expenseServ.allExpenses());
		return "index.jsp";
	}
	
	@PostMapping("/createExpense")
	public String createExpense(@Valid @ModelAttribute("expense") Expense expense, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("allExpenses", expenseServ.allExpenses());
			return "index.jsp";
		}else {
			expenseServ.createExpense(expense);
			return "redirect:/";
		}
	}
	
	@GetMapping("/expenses/{id}/edit")
	public String editExpense(@PathVariable("id") Long id, @ModelAttribute("updateForm") Expense expense, Model model) {
		model.addAttribute("expense", expenseServ.oneExpense(id));
		return "edit.jsp";
	}
	
	@PutMapping("/expenses/{id}/update")
	public String updateExpense(@PathVariable("id") Long id, @Valid @ModelAttribute("updateForm") Expense expense, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("expense", expenseServ.oneExpense(id));
			return "edit.jsp";
		}else {
			expenseServ.updateExpense(expense);
			return "redirect:/";
		}
	}
	
	@GetMapping("/expenses/{id}")
	public String oneExpense(@PathVariable("id") Long id, @ModelAttribute("expense") Expense expense, Model model) {
		model.addAttribute("expense", expenseServ.oneExpense(id));
		return "details.jsp";
	}
	
	@GetMapping("/expenses/{id}/delete")
	public String deleteExpense(@PathVariable("id") Long id) {
		expenseServ.deleteExpense(id);
		return "redirect:/";
	}
}
