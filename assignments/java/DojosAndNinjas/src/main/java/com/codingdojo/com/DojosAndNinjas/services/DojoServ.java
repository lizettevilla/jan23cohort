package com.codingdojo.com.DojosAndNinjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.com.DojosAndNinjas.models.Dojo;
import com.codingdojo.com.DojosAndNinjas.repositories.DojoRepo;

@Service
public class DojoServ {
	
	@Autowired
	private DojoRepo dojoRepo;
	
	public List<Dojo> getAll(){
		return dojoRepo.findAll();
	}
	
	public Dojo getOne(Long id) {
		return dojoRepo.findById(id).orElse(null);
	}
	
	public Dojo createOne(Dojo i) {
		return dojoRepo.save(i);
	}
	
}