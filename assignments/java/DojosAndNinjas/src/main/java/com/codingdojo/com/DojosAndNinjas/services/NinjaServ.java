package com.codingdojo.com.DojosAndNinjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.com.DojosAndNinjas.models.Ninja;
import com.codingdojo.com.DojosAndNinjas.repositories.NinjaRepo;

@Service
public class NinjaServ {
	
	@Autowired
	private NinjaRepo ninjaRepo;
	
//	Read
	public List<Ninja> getAll(){
		return ninjaRepo.findAll();
	}
	
//	Create
	public Ninja createOne(Ninja i) {
		return ninjaRepo.save(i);
	}
	
}