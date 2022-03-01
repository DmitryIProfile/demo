package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "merchandise")
public class Merchandise implements Serializable {

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

    @Column(name = "description")
    private String description;

    @Column(name = "eventId")
    private Long eventId;

    @Column(name = "fee")
    private BigDecimal fee;

    @Column(name = "label")
    private String label;

    @Column(name = "name")
    private String name;

    @Column(name = "overallQuantity")
    private Long overallQuantity;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "ticketTypeEnabled")
    private Boolean ticketTypeEnabled;

    @Column(name = "ticketTypeId")
    private Long ticketTypeId;

    @Column(name = "imageName")
    private String imageName;

    @Column(name = "maxAmountPerTicket")
    private Long maxAmountPerTicket;

    @Column(name = "allowedAmounts")
    private String allowedAmounts;

    @Column(name = "type")
    private String type;

    @Column(name = "feePercentage")
    private BigDecimal feePercentage;

    @Column(name = "cyclingMerchandise")
    private Boolean cyclingMerchandise;

    @Column(name = "hideFromPurchase")
    private Boolean hideFromPurchase;

    @Column(name = "hideFromPurchaseDate")
    private Date hideFromPurchaseDate;

    @Column(name = "elverysProductId")
    private Long elverysProductId;

    @Column(name = "required")
    private Boolean required;

    @Column(name = "boxofficeQuantity")
    private Long boxofficeQuantity;

    @Column(name = "optionalFieldId")
    private Long optionalFieldId;

    @Column(name = "optionalFieldCode")
    private String optionalFieldCode;

    @Column(name = "optionalFieldCodes")
    private String optionalFieldCodes;

    @Column(name = "optionalFieldsDescription")
    private String optionalFieldsDescription;

    @Column(name = "allowPurchaseInMMB")
    private Boolean allowPurchaseInMMB;

    @Column(name = "multiStripeAccountIndex")
    private Integer multiStripeAccountIndex;

    @Column(name = "separatePage")
    private Boolean separatePage;

    @Column(name = "noMinimalFeeOverride")
    private Boolean noMinimalFeeOverride;

    @Column(name = "bundleGroupId")
    private Long bundleGroupId;

}
