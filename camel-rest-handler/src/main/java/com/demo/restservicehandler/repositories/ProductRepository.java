package com.demo.restservicehandler.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.restservicehandler.domain.Product;

/**
 * @author Chittaranjan
 *
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
	// Repository to perform database operation on Product
}
