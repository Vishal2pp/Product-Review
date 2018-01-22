package com.product.model;


import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the category database table.
 * 
 */
@Entity
@NamedQuery(name="Category.findAll", query="SELECT c FROM Category c")
public class Category implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int categoryId;

	private String categoryName;

	private int noOfProducts;

	//bi-directional many-to-one association to Product
	@OneToMany(mappedBy="category")
	private List<Product> products;

	//bi-directional many-to-one association to Productrequest
	@OneToMany(mappedBy="category")
	private List<Productrequest> productrequests;

	//bi-directional many-to-one association to Subcategory
	@OneToMany(mappedBy="category")
	private List<Subcategory> subcategories;

	public Category() {
	}

	public int getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public int getNoOfProducts() {
		return this.noOfProducts;
	}

	public void setNoOfProducts(int noOfProducts) {
		this.noOfProducts = noOfProducts;
	}

	public List<Product> getProducts() {
		return this.products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Product addProduct(Product product) {
		getProducts().add(product);
		product.setCategory(this);

		return product;
	}

	public Product removeProduct(Product product) {
		getProducts().remove(product);
		product.setCategory(null);

		return product;
	}

	public List<Productrequest> getProductrequests() {
		return this.productrequests;
	}

	public void setProductrequests(List<Productrequest> productrequests) {
		this.productrequests = productrequests;
	}

	public Productrequest addProductrequest(Productrequest productrequest) {
		getProductrequests().add(productrequest);
		productrequest.setCategory(this);

		return productrequest;
	}

	public Productrequest removeProductrequest(Productrequest productrequest) {
		getProductrequests().remove(productrequest);
		productrequest.setCategory(null);

		return productrequest;
	}

	public List<Subcategory> getSubcategories() {
		return this.subcategories;
	}

	public void setSubcategories(List<Subcategory> subcategories) {
		this.subcategories = subcategories;
	}

	public Subcategory addSubcategory(Subcategory subcategory) {
		getSubcategories().add(subcategory);
		subcategory.setCategory(this);

		return subcategory;
	}

	public Subcategory removeSubcategory(Subcategory subcategory) {
		getSubcategories().remove(subcategory);
		subcategory.setCategory(null);

		return subcategory;
	}

}