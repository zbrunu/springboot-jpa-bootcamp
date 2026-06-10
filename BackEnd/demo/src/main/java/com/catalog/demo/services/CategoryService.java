package com.catalog.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.catalog.demo.entities.Category;
import com.catalog.demo.repositories.CategoryRepository;

@Service
public class CategoryService {

	public CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	
}
