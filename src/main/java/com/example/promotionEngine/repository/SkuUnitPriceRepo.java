package com.example.promotionEngine.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.promotionEngine.dto.SkuUnitPrice;
import com.example.promotionEngine.entity.SkuUnitPrinceEntity;

@Repository
public interface SkuUnitPriceRepo extends JpaRepository<SkuUnitPrice,Integer>{

	void saveAll(List<SkuUnitPrinceEntity> skuUnitPrinceEntityList);

}
