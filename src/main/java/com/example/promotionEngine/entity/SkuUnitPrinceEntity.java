package com.example.promotionEngine.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SkuUnitPrinceEntity {

	@Id
	private int id;

	private String SkuUnitName;

	private float skuUnitPrice;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSkuUnitName() {
		return SkuUnitName;
	}

	public void setSkuUnitName(String skuUnitName) {
		SkuUnitName = skuUnitName;
	}

	public float getSkuUnitPrice() {
		return skuUnitPrice;
	}

	public void setSkuUnitPrice(float skuUnitPrice) {
		this.skuUnitPrice = skuUnitPrice;
	}

}
