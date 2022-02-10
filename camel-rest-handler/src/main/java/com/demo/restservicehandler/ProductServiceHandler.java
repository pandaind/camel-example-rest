package com.demo.restservicehandler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.demo.restservicehandler.domain.Product;
import com.demo.restservicehandler.repositories.ProductRepository;

/**
 * @author Chittaranjan
 *
 */
public class ProductServiceHandler {

	@Autowired
	private ProductRepository productRepository;

	/**
	 * Get list of products from database
	 */
	@Transactional
	public List<Product> getProducts() {
		List<Product> products = (List<Product>) productRepository.findAll();
		return products;
	}

	/**
	 * Add or update a product to database
	 * 
	 * @param product without an id to save into database / product with an id to update into database
	 * @return currently saved product with a primary id from database
	 */
	@Transactional
	public Product addProduct(Product product) {
		Product savedProduct = productRepository.save(product);
		return savedProduct;
	}

	/**
	 * Delete a product from database
	 * 
	 * @param product with an id
	 */
	@Transactional
	public void deleteProduct(Product product) {
		productRepository.delete(product);
	}

	/** 
	 * Get a product by passing an id
	 * 
	 * @param id of the specific product to fetch from database
	 * @return a product w.r.t. primary id passed
	 */
	@Transactional
	public Product getProduct(Long id) {
		Product product = productRepository.findOne(id);
		return product;
	}
}
