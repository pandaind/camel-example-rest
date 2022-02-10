package com.demo.restservicehandler.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.restservicehandler.domain.Category;

/**
 * @author Chittaranjan
 *
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {
	// Repository to perform database operation on Category
}
