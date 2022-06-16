package cl.christian.catalogojpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import cl.christian.catalogojpa.model.Producto;


public interface ProductoRepository extends JpaRepository<Producto, Long> {

	@Query(value = "SELECT imagen FROM producto p WHERE p.id = ?", nativeQuery = true)
	String findImagenById(Long id);

}