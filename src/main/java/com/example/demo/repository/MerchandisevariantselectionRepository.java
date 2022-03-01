package com.example.demo.repository;

import com.example.demo.entity.Merchandisevariantselection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface MerchandisevariantselectionRepository extends JpaRepository<Merchandisevariantselection, Long>, JpaSpecificationExecutor<Merchandisevariantselection> {

}