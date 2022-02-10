package com.demo.restservicehandler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.demo.restservicehandler.domain.Category;
import com.demo.restservicehandler.repositories.CategoryRepository;

/**
 * @author Chittaranjan
 *
 */
public class CategoryServiceHandler {

	@Autowired
	private CategoryRepository categoryRepository;

	/**
	 * Get list of categories from database
	 */
	@Transactional
	public List<Category> getCategories() {
		List<Category> categories = (List<Category>) categoryRepository.findAll();
		return categories;
	}

	/**
	 * Add or update a category to database
	 * 
	 * @param category without an id to save into database / category with an id to update into database
	 * @return currently saved category with a primary id from database
	 */
	@Transactional
	public Category addCategory(Category category) {
		Category savedCategory = categoryRepository.save(category);
		return savedCategory;
	}

	/**
	 * Delete a category from database
	 * 
	 * @param category with an id
	 */
	@Transactional
	public void deleteCategory(Category category) {
		categoryRepository.delete(category);
	}

	/** 
	 * Get a category by passing an id
	 * 
	 * @param id of the specific category to fetch from database
	 * @return a category w.r.t. primary id passed
	 */
	@Transactional
	public Category getCategory(Long id) {
		Category category = categoryRepository.findOne(id);
		return category;
	}
}
