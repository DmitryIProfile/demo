package com.example.demo.repository;

import com.example.demo.entity.Merchandise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface MerchandiseRepository extends JpaRepository<Merchandise, Long>, JpaSpecificationExecutor<Merchandise> {

}