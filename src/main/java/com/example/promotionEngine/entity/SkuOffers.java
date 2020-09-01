package com.example.promotionEngine.entity;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class SkuOffers {

	private List<String> skuNames;

	private List<Integer> skuMinQuantity;

	private int offerPrice;

	public List<String> getSkuNames() {
		return skuNames;
	}

	public void setSkuNames(List<String> skuNames) {
		this.skuNames = skuNames;
	}

	public List<Integer> getSkuMinQuantity() {
		return skuMinQuantity;
	}

	public void setSkuMinQuantity(List<Integer> skuMinQuantity) {
		this.skuMinQuantity = skuMinQuantity;
	}

	public int getOfferPrice() {
		return offerPrice;
	}

	public void setOfferPrice(int offerPrice) {
		this.offerPrice = offerPrice;
	}

}
