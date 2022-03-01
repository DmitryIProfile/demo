package com.example.demo.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "ticket")
public class Ticket implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "createdBy", nullable = false)
    private String createdBy;

    @Column(name = "createdDate", nullable = false)
    private Date createdDate;

    @Column(name = "lastModifiedBy")
    private String lastModifiedBy;

    @Column(name = "lastModifiedDate")
    private Date lastModifiedDate;

    @Column(name = "barcode", nullable = false)
    private String barcode;

    @Column(name = "bookingId")
    private Long bookingId;

    @Column(name = "eventId")
    private Long eventId;

    @Column(name = "fee")
    private BigDecimal fee;

    @Column(name = "orderId")
    private Long orderId;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "registrantFormId")
    private Long registrantFormId;

    @Column(name = "ticketSelectionId")
    private Long ticketSelectionId;

    @Column(name = "ticketTypeId")
    private Long ticketTypeId;

    @Column(name = "timeslotId")
    private Long timeslotId;

    @Column(name = "uuid")
    private String uuid;

    @Column(name = "formIndex")
    private Integer formIndex;

    @Column(name = "ticketStatus")
    private String ticketStatus;

    @Column(name = "raceNumber")
    private Long raceNumber;

    @Column(name = "orderMode")
    private String orderMode;

    @Column(name = "deviceId")
    private String deviceId;

    @Column(name = "scannedDate")
    private Date scannedDate;

    @Column(name = "cancelReason")
    private String cancelReason;

    @Column(name = "linkToOldTicketId")
    private Long linkToOldTicketId;

    @Column(name = "userId")
    private Long userId;

    @Column(name = "ownerEmail")
    private String ownerEmail;

    @Column(name = "isForgotten")
    private Boolean isForgotten;

    @Column(name = "eventLevelDiscountAmount")
    private BigDecimal eventLevelDiscountAmount;

    @Column(name = "eventLevelDiscountFee")
    private BigDecimal eventLevelDiscountFee;

    @Column(name = "eventPriceDiscountCodeId")
    private Long eventPriceDiscountCodeId;

    @Column(name = "eventPriceDiscountId")
    private Long eventPriceDiscountId;

    @Column(name = "ticketNumber")
    private Long ticketNumber;

    @Column(name = "groupDiscountAmount")
    private BigDecimal groupDiscountAmount;

    @Column(name = "groupDiscountFee")
    private BigDecimal groupDiscountFee;

    @Column(name = "checkIn")
    private Boolean checkIn;

    @Column(name = "checkInDate")
    private Date checkInDate;

    @Column(name = "noRegData")
    private Boolean noRegData;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Ticket ticket = (Ticket) o;

        return Objects.equals(id, ticket.id);
    }

    @Override
    public int hashCode() {
        return 1150304004;
    }
}
