package com.duydoanvu.services;

import java.util.List;

import com.duydoanvu.models.Category;

public interface CategoryService {
	List<Category> getAll();

	Boolean create(Category category);

	Category findbyId(Integer id);

	Boolean update(Category category);

	Boolean delete(Integer id);
}
