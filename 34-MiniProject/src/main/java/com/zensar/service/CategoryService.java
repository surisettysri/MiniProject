package com.zensar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.bean.Category;
import com.zensar.db.CategoryDAO;

@Service
public class CategoryService {

	@Autowired
	CategoryDAO dao;

	public Category addCategory(Category category) {
		return this.dao.save(category);
	}

	public Category findByCategoryId(String categoryId) {

		Optional<Category> optional = this.dao.findById(categoryId);
		if (optional.isPresent())
			return optional.get();
		return null;
	}

	public Category updateCategoryById(Category category, int id) {
		return this.dao.save(category);
	}

	public List<Category> getAllCategories() {
		return this.dao.findAll();
	}

}
