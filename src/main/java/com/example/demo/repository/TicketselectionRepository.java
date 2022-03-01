package com.example.demo.repository;

import com.example.demo.entity.Ticketselection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TicketselectionRepository extends JpaRepository<Ticketselection, Long>, JpaSpecificationExecutor<Ticketselection> {

}