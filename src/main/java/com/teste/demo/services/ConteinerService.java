package com.teste.demo.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.demo.model.Conteiner;
import com.teste.demo.repo.ConteinerRepo;

@Service
@Transactional
public class ConteinerService {
	private final ConteinerRepo conteinerRepo;

	@Autowired
	public ConteinerService(ConteinerRepo conteinerRepo) {
		this.conteinerRepo = conteinerRepo;
	} 
	
	public Conteiner addConteiner(Conteiner conteiner) {
		return conteinerRepo.save(conteiner);
	}
	
	public Conteiner updateConteiner(Conteiner conteiner) {
		return conteinerRepo.save(conteiner);
	}
	
	public List<Conteiner> findAllContainers() {
		return conteinerRepo.findAll();
	}
	
	public void deleteConteiner(Long id) {
		conteinerRepo.deleteContainerById(id);
	}
	
}
