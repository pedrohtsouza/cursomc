package com.pedrosouza.cursomc.repositories;


	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

	import com.pedrosouza.cursomc.domain.Cidade;

	@Repository
	public interface  CidadeRepository extends JpaRepository<Cidade, Integer> {

}
