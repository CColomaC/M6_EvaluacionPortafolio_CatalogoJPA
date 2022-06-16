package cl.christian.catalogojpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import cl.christian.catalogojpa.model.Categoria;
import cl.christian.catalogojpa.repository.CategoriaRepository;

@Controller
public class SitioController {
	
	@Autowired
	CategoriaRepository categoriaRepository;

	// Crea una categoría de ejemplo
	@GetMapping("/")
	public String index() {
		long count = categoriaRepository.count();
		if(count == 0) {
			Categoria categoria = Categoria.builder().nombre("Categoria de ejemplo").build();
			categoriaRepository.saveAndFlush(categoria);
		}
		return "index";
	}
}