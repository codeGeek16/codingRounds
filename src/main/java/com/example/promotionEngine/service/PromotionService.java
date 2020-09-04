package com.example.promotionEngine.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.promotionEngine.dto.SkuBasket;
import com.example.promotionEngine.dto.SkuOffers;
import com.example.promotionEngine.dto.SkuUnitPrice;
import com.example.promotionEngine.entity.SkuUnitPrinceEntity;
import com.example.promotionEngine.repository.SkuUnitPriceRepo;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class PromotionService {

	@Autowired
	private SkuUnitPriceRepo skuUnitPriceRepo;

	public void computeBasket(SkuBasket basket) {
		//get the list of items in the basket
		//fetch the offers available
		//check the best applicable offer for the items in the basket
		//if there is a match in offers and basket items, apply the offer,update the finalComputedPrice 
		//and remove items from the basket
		//iterate till there are no items in the basket
		//final price after computation will be stored in the finalComputedPrice 
		
		

	}

	public void skuUnitPrice(List<SkuUnitPrice> unitPriceList) {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		// convert dto to entity
		List<SkuUnitPrinceEntity> skuUnitPrinceEntityList = new ArrayList<>();
		for(SkuUnitPrice unitPrice:unitPriceList){
			SkuUnitPrinceEntity convertValue = mapper.convertValue(unitPrice, SkuUnitPrinceEntity.class);
			skuUnitPrinceEntityList.add(convertValue);
		}
		skuUnitPriceRepo.saveAll(skuUnitPrinceEntityList);
	}

	public void skuOfferPrice(List<SkuOffers> offerPriceList) {
		// TODO Auto-generated method stub

	}

	public float computeBasket(List<SkuBasket> basketItems, List<SkuOffers> offers, List<SkuUnitPrice> skuUnitPrices) {
				//get the list of items in the basket
				//fetch the offers available
				//check the best applicable offer for the items in the basket
				//if there is a match in offers and basket items, apply the offer,update the finalComputedPrice 
				//and remove items from the basket
				//iterate till there are no items in the basket
				//final price after computation will be stored in the finalComputedPrice 
		
				return 0.0f;
	}

}
