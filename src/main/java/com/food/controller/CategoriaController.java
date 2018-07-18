package com.food.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.food.entity.Categoria;
import com.food.repository.CategoriaRespository;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

	@Autowired
	private CategoriaRespository categoriaRepository;
	
	@GetMapping("/findAll")
    public List<Categoria> obtenerProductos(){
    	return (List<Categoria>) categoriaRepository.findAll();
    }
	
}
