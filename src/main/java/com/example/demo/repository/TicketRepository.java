package com.example.demo.repository;

import com.example.demo.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface TicketRepository extends BaseJpaRepository<Ticket, Long> {
    <T> List<T> findByEventId(Long eventId, Class<T> type);

}