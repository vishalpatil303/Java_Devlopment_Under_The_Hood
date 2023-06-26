package com.restaurent.domain;

import java.math.BigDecimal;

public class MenuItem {

	private int id;
	private String name;
	private String description;
	private MenuCategory category;
	private BigDecimal price;

	public MenuItem(int id, String name, String description, MenuCategory category, BigDecimal price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.category = category;
		this.price = price;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public MenuCategory getCategory() {
		return category;
	}

	public void setCategory(MenuCategory category) {
		this.category = category;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "id= " + id + ", name=" + name + ", description= " + description + ", category= " + category
				+ ", price= " + price  ;
	}

}
