package com.product.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the subcategory database table.
 * 
 */
@Entity
@NamedQuery(name="Subcategory.findAll", query="SELECT s FROM Subcategory s")
public class Subcategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int subCategoryId;

	private int noOfProducts;

	private String subCategoryName;

	//bi-directional many-to-one association to Product
	@OneToMany(mappedBy="subcategory")
	private List<Product> products;

	//bi-directional many-to-one association to Productrequest
	@OneToMany(mappedBy="subcategory")
	private List<Productrequest> productrequests;

	//bi-directional many-to-one association to Category
	@ManyToOne
	@JoinColumn(name="categoryId")
	private Category category;

	public Subcategory() {
	}

	public int getSubCategoryId() {
		return this.subCategoryId;
	}

	public void setSubCategoryId(int subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public int getNoOfProducts() {
		return this.noOfProducts;
	}

	public void setNoOfProducts(int noOfProducts) {
		this.noOfProducts = noOfProducts;
	}

	public String getSubCategoryName() {
		return this.subCategoryName;
	}

	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}

	public List<Product> getProducts() {
		return this.products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Product addProduct(Product product) {
		getProducts().add(product);
		product.setSubcategory(this);

		return product;
	}

	public Product removeProduct(Product product) {
		getProducts().remove(product);
		product.setSubcategory(null);

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
		productrequest.setSubcategory(this);

		return productrequest;
	}

	public Productrequest removeProductrequest(Productrequest productrequest) {
		getProductrequests().remove(productrequest);
		productrequest.setSubcategory(null);

		return productrequest;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}