package com.example.demo.repository;

import com.example.demo.entity.Registrantdata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RegistrantdataRepository extends JpaRepository<Registrantdata, Long>, JpaSpecificationExecutor<Registrantdata> {

}