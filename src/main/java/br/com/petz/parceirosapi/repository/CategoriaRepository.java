package br.com.petz.parceirosapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.petz.parceirosapi.entity.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Long> {
}
