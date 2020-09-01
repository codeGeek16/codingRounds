package com.example.promotionEngine.dto;

import java.util.List;

public class SkuOffers {

	private List<String> skuName;
	private List<Integer> skuCount;
	private float skuOfferPrice;

	public List<String> getSkuName() {
		return skuName;
	}

	public void setSkuName(List<String> skuName) {
		this.skuName = skuName;
	}

	public List<Integer> getSkuCount() {
		return skuCount;
	}

	public void setSkuCount(List<Integer> skuCount) {
		this.skuCount = skuCount;
	}

	public float getSkuOfferPrice() {
		return skuOfferPrice;
	}

	public void setSkuOfferPrice(float skuOfferPrice) {
		this.skuOfferPrice = skuOfferPrice;
	}

}
