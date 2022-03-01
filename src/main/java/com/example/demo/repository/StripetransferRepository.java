package com.example.demo.repository;

import com.example.demo.entity.Stripetransfer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StripetransferRepository extends JpaRepository<Stripetransfer, Long>, JpaSpecificationExecutor<Stripetransfer> {

}