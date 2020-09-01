package com.example.promotionEngine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.promotionEngine.dto.SkuUnitPrice;

@Repository
public interface SkuUnitPriceRepo extends JpaRepository<SkuUnitPrice,Integer>{

}
