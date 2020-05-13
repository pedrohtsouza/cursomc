package com.pedrosouza.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedrosouza.cursomc.domain.Categoria;
import com.pedrosouza.cursomc.repositories.CategoriaRepository;
import com.pedrosouza.cursomc.resources.exceptions.ObjectNotFoundException;

import java.util.Optional;

@Service
public class CategoriaService {
	
	
	@Autowired
	private CategoriaRepository repo;

	public Categoria find(Integer id) {
			Optional<Categoria> obj = repo.findById(id);
			return obj.orElseThrow(() -> new ObjectNotFoundException(
					"Obejeto não encontrado ! Id:" + id + ", Tipo: " + Categoria.class.getName()));

		
		
	}
}
