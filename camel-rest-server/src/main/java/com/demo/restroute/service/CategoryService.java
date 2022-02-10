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

import com.demo.restservicehandler.domain.Category;

/**
 * @author Chittaranjan
 *
 */
@Path("/category/")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
public interface CategoryService {

	@POST
	@Path("/add/")
	public Category addCategory(Category category);
	
	@PUT
	@Path("/update/")
	public Category updateCategory(Category category);

	@DELETE
	@Path("/delete/")
	public Category deleteCategory(Category category);

	@GET
	@Path("/list/")
	public List<Category> getCategories();

	@GET
	@Path("/{id}/")
	public List<Category> getCategory(@PathParam(value = "id") Long id);

}
