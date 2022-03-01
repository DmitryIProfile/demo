package com.example.demo.repository;

import com.example.demo.entity.Merchandisepriceoption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface MerchandisepriceoptionRepository extends JpaRepository<Merchandisepriceoption, Long>, JpaSpecificationExecutor<Merchandisepriceoption> {

}