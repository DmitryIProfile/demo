package com.example.demo.repository;

import com.example.demo.entity.Fundraisingtransfertobenefactor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface FundraisingtransfertobenefactorRepository extends JpaRepository<Fundraisingtransfertobenefactor, Long>, JpaSpecificationExecutor<Fundraisingtransfertobenefactor> {

}