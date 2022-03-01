package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "booking")
public class Booking implements Serializable {

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

    @Column(name = "eventid")
    private Long eventId;

    @Column(name = "status")
    private String status;

    @Column(name = "timeslotid")
    private Long timeslotId;

    @Column(name = "timeslotselectdate")
    private Date timeslotSelectDate;

    @Column(name = "visitorid")
    private String visitorId;

    @Column(name = "step")
    private String step;

    @Column(name = "mode")
    private String mode;

    @Column(name = "accesscodeid")
    private Long accessCodeId;

    @Column(name = "bundleid")
    private Long bundleId;

    @Column(name = "bundlebookingid")
    private Long bundleBookingId;

    @Column(name = "querystring")
    private String queryString;

    @Column(name = "eventpricediscountcodeid")
    private Long eventPriceDiscountCodeId;

    @Column(name = "eventpricediscountid")
    private Long eventPriceDiscountId;

    @Column(name = "uniquediscountcode")
    private String uniqueDiscountCode;

}
