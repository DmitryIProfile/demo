package com.example.demo.repository;

import com.example.demo.entity.Fundraisingpage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface FundraisingpageRepository extends JpaRepository<Fundraisingpage, Long>, JpaSpecificationExecutor<Fundraisingpage> {

}