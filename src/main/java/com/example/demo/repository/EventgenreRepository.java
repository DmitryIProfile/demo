package com.example.demo.repository;

import com.example.demo.entity.Eventgenre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EventgenreRepository extends JpaRepository<Eventgenre, Long>, JpaSpecificationExecutor<Eventgenre> {

}