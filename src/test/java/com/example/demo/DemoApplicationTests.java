package com.example.demo;

import com.example.demo.entity.QBooking;
import com.example.demo.entity.QTicket;
import com.example.demo.entity.QTickettype;
import com.example.demo.repository.BookingRepository;
import com.example.demo.repository.TicketRepository;
import com.querydsl.core.support.FetchableQueryBase;
import com.querydsl.core.support.QueryBase;
import com.querydsl.jpa.impl.JPAQuery;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private TicketRepository ticketRepository;

    @PersistenceContext
    private EntityManager entityManager;

    @Test
    void contextLoads() {
        QBooking qBooking = QBooking.booking;
        QTicket qTicket = QTicket.ticket;
        QTickettype qTickettype = QTickettype.tickettype;

        JPAQuery jpaQuery = new JPAQuery(entityManager);

        QueryBase queryBase = jpaQuery.select(
                qTicket.id,
                qTicket.registrantFormId,
                qTicket.barcode,
                qTicket.fee,
                qTicket.raceNumber,
                qTickettype.name).from(qTicket).join(qTickettype).on(qTicket.ticketTypeId.eq(qTickettype.id))
                .where(qTicket.eventId.eq(1168L));

        queryBase.orderBy(qTicket.id.asc());

        FetchableQueryBase fetchable = (FetchableQueryBase) queryBase;
        List fetch = fetchable.fetch();
        fetch.forEach(System.out::println);
        System.out.println(fetch);
    }

}
