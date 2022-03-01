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

    @Column(name = "createdby", nullable = false)
    private String createdBy;

    @Column(name = "createddate", nullable = false)
    private Date createdDate;

    @Column(name = "lastmodifiedby")
    private String lastModifiedBy;

    @Column(name = "lastmodifieddate")
    private Date lastModifiedDate;

    @Column(name = "barcode", nullable = false)
    private String barcode;

    @Column(name = "bookingid")
    private Long bookingId;

    @Column(name = "eventid")
    private Long eventId;

    @Column(name = "fee")
    private BigDecimal fee;

    @Column(name = "orderid")
    private Long orderId;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "registrantformid")
    private Long registrantFormId;

    @Column(name = "ticketselectionid")
    private Long ticketSelectionId;

    @Column(name = "tickettypeid")
    private Long ticketTypeId;

    @Column(name = "timeslotid")
    private Long timeslotId;

    @Column(name = "uuid")
    private String uuid;

    @Column(name = "formindex")
    private Integer formIndex;

    @Column(name = "ticketstatus")
    private String ticketStatus;

    @Column(name = "raceNumber")
    private Long raceNumber;

    @Column(name = "orderMode")
    private String orderMode;

    @Column(name = "deviceid")
    private String deviceId;

    @Column(name = "scanneddate")
    private Date scannedDate;

    @Column(name = "cancelReason")
    private String cancelReason;

    @Column(name = "linktooldticketid")
    private Long linkToOldTicketId;

    @Column(name = "userid")
    private Long userId;

    @Column(name = "owneremail")
    private String ownerEmail;

    @Column(name = "isforgotten")
    private Boolean isForgotten;

    @Column(name = "eventleveldiscountamount")
    private BigDecimal eventLevelDiscountAmount;

    @Column(name = "eventleveldiscountfee")
    private BigDecimal eventLevelDiscountFee;

    @Column(name = "eventpricediscountcodeid")
    private Long eventPriceDiscountCodeId;

    @Column(name = "eventpricediscountid")
    private Long eventPriceDiscountId;

    @Column(name = "ticketnumber")
    private Long ticketNumber;

    @Column(name = "groupdiscountamount")
    private BigDecimal groupDiscountAmount;

    @Column(name = "groupdiscountfee")
    private BigDecimal groupDiscountFee;

    @Column(name = "checkin")
    private Boolean checkIn;

    @Column(name = "checkindate")
    private Date checkInDate;

    @Column(name = "noregdata")
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
