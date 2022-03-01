package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "tickettype")
public class Tickettype implements Serializable {

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

    @Column(name = "currency")
    private String currency;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "event_id", nullable = false)
    private Long eventId;

    @Column(name = "availablequantity")
    private Long availableQuantity;

    @Column(name = "max")
    private Long max;

    @Column(name = "min")
    private Long min;

    @Column(name = "datefieldcode")
    private String dateFieldCode;

    @Column(name = "maxquantityperorder")
    private Long maxQuantityPerOrder;

    @Column(name = "maxrestrictiondate")
    private Date maxRestrictionDate;

    @Column(name = "minquantityperorder")
    private Long minQuantityPerOrder;

    @Column(name = "minrestrictiondate")
    private Date minRestrictionDate;

    @Column(name = "type")
    private String type;

    @Column(name = "serviceFee")
    private BigDecimal serviceFee;

    @Column(name = "fixedservicefee")
    private BigDecimal fixedServiceFee;

    @Column(name = "hideFromBooking")
    private Boolean hideFromBooking;

    @Column(name = "hidefrombookingdate")
    private Date hideFromBookingDate;

    @Column(name = "additionaltext1")
    private String additionalText1;

    @Column(name = "eticketsAmount")
    private Long eticketsAmount;

    @Column(name = "enableavailablequantityfromgroup")
    private Boolean enableAvailableQuantityFromGroup;

    @Column(name = "tickettypeavailabilitygroupname")
    private String ticketTypeAvailabilityGroupName;

    @Column(name = "feetype")
    private String feeType;

    @Column(name = "remainingtranchquantitytodisplay")
    private Long remainingTranchQuantityToDisplay;

    @Column(name = "includeincireport")
    private Boolean includeInCIReport;

    @Column(name = "sorting")
    private Long sorting;

    @Column(name = "infodescription")
    private String infoDescription;

    @Column(name = "hidecountsetting")
    private Integer hideCountSetting;

    @Column(name = "enablepartialpayments")
    private Boolean enablePartialPayments;

    @Column(name = "hidesettingtype")
    private String hideSettingType;

    @Column(name = "hidewhenpreviousreleasenotsold")
    private Boolean hideWhenPreviousReleaseNotSold;

    @Column(name = "releasethresholdquantity")
    private Long releaseThresholdQuantity;

    @Column(name = "accesscode")
    private String accessCode;

    @Column(name = "accesscodequantity")
    private Integer accessCodeQuantity;

    @Column(name = "accesskey")
    private String accessKey;

    @Column(name = "accesskeyquantity")
    private Integer accessKeyQuantity;

    @Column(name = "refundpercentage")
    private BigDecimal refundPercentage;

    @Column(name = "noregdata")
    private Boolean noRegData;

    @Column(name = "enableaccesscodes")
    private Boolean enableAccessCodes;

    @Column(name = "imagename")
    private String imageName;

    @Column(name = "showtickettypeclosedate")
    private Date showTicketTypeCloseDate;

    @Column(name = "showtickettypeopendate")
    private Date showTicketTypeOpenDate;

    @Column(name = "cyclingdatetime")
    private String cyclingDateTime;

    @Column(name = "cyclingdateuuid")
    private String cyclingDateUuid;

    @Column(name = "cyclingsubcategory")
    private String cyclingSubCategory;

}
