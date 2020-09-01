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

}
