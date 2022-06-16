package cl.christian.catalogojpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.christian.catalogojpa.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
