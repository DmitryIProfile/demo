package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "ticketselection")
public class Ticketselection implements Serializable {

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

    @Column(name = "bookingId")
    private Long bookingId;

    @Column(name = "eventId")
    private Long eventId;

    @Column(name = "expireTime", nullable = false)
    private Date expireTime;

    @Column(name = "fee")
    private BigDecimal fee;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "quantity")
    private Long quantity;

    @Column(name = "ticketTypeId")
    private Long ticketTypeId;

    @Column(name = "timeslotId")
    private Long timeslotId;

    @Column(name = "uuid")
    private String uuid;

    @Column(name = "currency")
    private String currency;

    @Column(name = "boxofficePrice")
    private BigDecimal boxofficePrice;

    @Column(name = "bundleDiscountId")
    private Long bundleDiscountId;

    @Column(name = "bundleDiscountPrice")
    private BigDecimal bundleDiscountPrice;

    @Column(name = "bundleId")
    private Long bundleId;

    @Column(name = "codeDiscountPrice")
    private BigDecimal codeDiscountPrice;

    @Column(name = "groupDiscountId")
    private Long groupDiscountId;

    @Column(name = "groupDiscountPrice")
    private BigDecimal groupDiscountPrice;

    @Column(name = "overridenPrice")
    private BigDecimal overridenPrice;

    @Column(name = "priceDiscountCodeId")
    private Long priceDiscountCodeId;

    @Column(name = "priceDiscountId")
    private Long priceDiscountId;

    @Column(name = "priceTranchId")
    private Long priceTranchId;

    @Column(name = "ticketTypePrice")
    private BigDecimal ticketTypePrice;

    @Column(name = "priceDiscountCode")
    private String priceDiscountCode;

    @Column(name = "boxofficeOrderPrice")
    private BigDecimal boxofficeOrderPrice;

    @Column(name = "overridenFee")
    private BigDecimal overridenFee;

    @Column(name = "ticketTypeFee")
    private BigDecimal ticketTypeFee;

    @Column(name = "eticketsAmount")
    private Long eticketsAmount;

    @Column(name = "isPartialPayment")
    private Boolean isPartialPayment;

    @Column(name = "isAccessKey")
    private Boolean isAccessKey;

    @Column(name = "orderId")
    private Long orderId;

    @Column(name = "noRegData")
    private Boolean noRegData;

}
