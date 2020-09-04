package com.example.promotionEngine.dto;

import java.util.HashMap;
import java.util.Map;

public class SkuOffers {

	private Map<String, Integer> skuNameQantityMap = new HashMap<>();
	private float skuOfferPrice;

	public Map<String, Integer> getSkuNameQantityMap() {
		return skuNameQantityMap;
	}

	public void setSkuNameQantityMap(Map<String, Integer> skuNameQantityMap) {
		this.skuNameQantityMap = skuNameQantityMap;
	}

	public float getSkuOfferPrice() {
		return skuOfferPrice;
	}

	public void setSkuOfferPrice(float skuOfferPrice) {
		this.skuOfferPrice = skuOfferPrice;
	}

}
