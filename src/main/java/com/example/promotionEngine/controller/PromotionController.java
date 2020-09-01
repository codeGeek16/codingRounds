package com.example.promotionEngine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.promotionEngine.dto.SkuBasket;
import com.example.promotionEngine.dto.SkuOffers;
import com.example.promotionEngine.dto.SkuUnitPrice;
import com.example.promotionEngine.service.PromotionService;

@RestController
@RequestMapping(value="/api/promotion")
public class PromotionController {

	@Autowired
	private PromotionService promotionService;
	
	@PostMapping(value ="/basket")
	public void computeBasket(@RequestBody SkuBasket basket){
		promotionService.computeBasket(basket);
	}
	
	@PostMapping(value ="/unitPriceList")
	public void skuUnitPrice(@RequestBody List<SkuUnitPrice> unitPriceList){
		promotionService.skuUnitPrice(unitPriceList);
	}
	
	@PostMapping(value ="/offersList")
	public void skuOfferPrice(@RequestBody List<SkuOffers> offerPriceList){
		promotionService.skuOfferPrice(offerPriceList);
	}
	
}
