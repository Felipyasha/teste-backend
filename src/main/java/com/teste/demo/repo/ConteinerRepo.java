package com.teste.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.demo.model.Conteiner;

public interface ConteinerRepo extends JpaRepository<Conteiner, Long>{

	void deleteContainerById(Long id);

}
