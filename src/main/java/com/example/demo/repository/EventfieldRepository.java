package com.example.demo.repository;

import com.example.demo.entity.Eventfield;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EventfieldRepository extends JpaRepository<Eventfield, Long>, JpaSpecificationExecutor<Eventfield> {

}