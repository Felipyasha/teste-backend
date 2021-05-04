package com.teste.demo;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.demo.model.Conteiner;
import com.teste.demo.services.ConteinerService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/conteiner")
public class ConteinerController {
	
	private final ConteinerService conteinerService;

	public ConteinerController(ConteinerService conteinerService) {
		this.conteinerService = conteinerService;
	} 
	
	@GetMapping("/all")
	public ResponseEntity<List<Conteiner>> getAllContainer() {
		List<Conteiner> conteiners = conteinerService.findAllContainers();
		return new ResponseEntity<>(conteiners, HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Conteiner> addContainer(@RequestBody Conteiner conteiner) {
		Conteiner newContainer = conteinerService.addConteiner(conteiner);
		return new ResponseEntity<>(newContainer, HttpStatus.CREATED);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Conteiner> updateContainer(@RequestBody Conteiner conteiner) {
		Conteiner updateContainer = conteinerService.updateConteiner(conteiner);
		return new ResponseEntity<>(updateContainer, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Long> deleteContainer(@PathVariable Long id) {
		conteinerService.deleteConteiner(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
	
	
	
	


}
