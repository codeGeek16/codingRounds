package com.example.promotionEngine.service.test;


import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.promotionEngine.dto.SkuBasket;
import com.example.promotionEngine.dto.SkuOffers;
import com.example.promotionEngine.dto.SkuUnitPrice;
import com.example.promotionEngine.service.PromotionService;

@RunWith(SpringRunner.class)
public class PromotionServiceTest {
	
	@Autowired
	PromotionService promService;
	
	@Test
	public void testBucketFinalValue() {
		
		List<SkuBasket> basketItems = new ArrayList<>();
		SkuBasket basketItem = new SkuBasket();
		basketItem.setSkuName("A");
		basketItem.setSkuQantity(2);
		
		SkuOffers offer = new SkuOffers();
		
		List<SkuOffers> offers = new ArrayList<>();
		Map<String,Integer> mapColl = new HashMap<>();
		mapColl.put("A",3);
		offer.setSkuNameQantityMap(mapColl);
		offer.setSkuOfferPrice(130);
		
		offers.add(offer);
		
		List<SkuUnitPrice> skuUnitPrices = new ArrayList<>();
		SkuUnitPrice skuUnitPrice = new SkuUnitPrice();
		skuUnitPrice.setSkuName("A");
		skuUnitPrice.setUnitPrice(50);
		
		assertEquals(promService.computeBasket(basketItems,offers,skuUnitPrices),150.0f);
	}

}
