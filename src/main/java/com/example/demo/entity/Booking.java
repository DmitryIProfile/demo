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

    @Column(name = "createdBy", nullable = false)
    private String createdBy;

    @Column(name = "createdDate", nullable = false)
    private Date createdDate;

    @Column(name = "lastModifiedBy")
    private String lastModifiedBy;

    @Column(name = "lastModifiedDate")
    private Date lastModifiedDate;

    @Column(name = "eventId")
    private Long eventId;

    @Column(name = "status")
    private String status;

    @Column(name = "timeslotId")
    private Long timeslotId;

    @Column(name = "timeslotSelectDate")
    private Date timeslotSelectDate;

    @Column(name = "visitorId")
    private String visitorId;

    @Column(name = "step")
    private String step;

    @Column(name = "mode")
    private String mode;

    @Column(name = "accessCodeId")
    private Long accessCodeId;

    @Column(name = "bundleId")
    private Long bundleId;

    @Column(name = "bundleBookingId")
    private Long bundleBookingId;

    @Column(name = "queryString")
    private String queryString;

    @Column(name = "eventPriceDiscountCodeId")
    private Long eventPriceDiscountCodeId;

    @Column(name = "eventPriceDiscountId")
    private Long eventPriceDiscountId;

    @Column(name = "uniqueDiscountCode")
    private String uniqueDiscountCode;

}
