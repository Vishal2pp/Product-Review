package com.product.model;


import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the productrequest database table.
 * 
 */
@Entity
@NamedQuery(name="Productrequest.findAll", query="SELECT p FROM Productrequest p")
public class Productrequest implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int requestId;

	private String productName;

	//bi-directional many-to-one association to Category
	@ManyToOne
	@JoinColumn(name="categoryId")
	private Category category;

	//bi-directional many-to-one association to Subcategory
	@ManyToOne
	@JoinColumn(name="subCategoryId")
	private Subcategory subcategory;

	public Productrequest() {
	}

	public int getRequestId() {
		return this.requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Subcategory getSubcategory() {
		return this.subcategory;
	}

	public void setSubcategory(Subcategory subcategory) {
		this.subcategory = subcategory;
	}

}