package com.demo.restroute.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.demo.restservicehandler.domain.Product;

/**
 * @author Chittaranjan
 *
 */
@Path("/product/")
@Consumes({ MediaType.APPLICATION_JSON, })
@Produces({ MediaType.APPLICATION_JSON, })
public interface ProductService {

	@POST
	@Path("/add/")
	public Product addProduct(Product product);

	@PUT
	@Path("/update/")
	public Product updateProduct(Product product);

	@DELETE
	@Path("/delete/")
	public Product deleteProduct(Product product);

	@GET
	@Path("/list/")
	public List<Product> getProducts();

	@GET
	@Path("/{id}/")
	public List<Product> getProduct(@PathParam(value = "id") Long id);
}
