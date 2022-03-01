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

    @Column(name = "createdBy", nullable = false)
    private String createdBy;

    @Column(name = "createdDate", nullable = false)
    private Date createdDate;

    @Column(name = "lastModifiedBy")
    private String lastModifiedBy;

    @Column(name = "lastModifiedDate")
    private Date lastModifiedDate;

    @Column(name = "currency")
    private String currency;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "event_id", nullable = false)
    private Long eventId;

    @Column(name = "availableQuantity")
    private Long availableQuantity;

    @Column(name = "max")
    private Long max;

    @Column(name = "min")
    private Long min;

    @Column(name = "dateFieldCode")
    private String dateFieldCode;

    @Column(name = "maxQuantityPerOrder")
    private Long maxQuantityPerOrder;

    @Column(name = "maxRestrictionDate")
    private Date maxRestrictionDate;

    @Column(name = "minQuantityPerOrder")
    private Long minQuantityPerOrder;

    @Column(name = "minRestrictionDate")
    private Date minRestrictionDate;

    @Column(name = "type")
    private String type;

    @Column(name = "serviceFee")
    private BigDecimal serviceFee;

    @Column(name = "fixedServiceFee")
    private BigDecimal fixedServiceFee;

    @Column(name = "hideFromBooking")
    private Boolean hideFromBooking;

    @Column(name = "hideFromBookingDate")
    private Date hideFromBookingDate;

    @Column(name = "additionalText1")
    private String additionalText1;

    @Column(name = "eticketsAmount")
    private Long eticketsAmount;

    @Column(name = "enableAvailableQuantityFromGroup")
    private Boolean enableAvailableQuantityFromGroup;

    @Column(name = "ticketTypeAvailabilityGroupName")
    private String ticketTypeAvailabilityGroupName;

    @Column(name = "feeType")
    private String feeType;

    @Column(name = "remainingTranchQuantityToDisplay")
    private Long remainingTranchQuantityToDisplay;

    @Column(name = "includeInCIReport")
    private Boolean includeInCIReport;

    @Column(name = "sorting")
    private Long sorting;

    @Column(name = "infoDescription")
    private String infoDescription;

    @Column(name = "hideCountSetting")
    private Integer hideCountSetting;

    @Column(name = "enablePartialPayments")
    private Boolean enablePartialPayments;

    @Column(name = "hideSettingType")
    private String hideSettingType;

    @Column(name = "hideWhenPreviousReleaseNotSold")
    private Boolean hideWhenPreviousReleaseNotSold;

    @Column(name = "releaseThresholdQuantity")
    private Long releaseThresholdQuantity;

    @Column(name = "accessCode")
    private String accessCode;

    @Column(name = "accessCodeQuantity")
    private Integer accessCodeQuantity;

    @Column(name = "accessKey")
    private String accessKey;

    @Column(name = "accessKeyQuantity")
    private Integer accessKeyQuantity;

    @Column(name = "refundPercentage")
    private BigDecimal refundPercentage;

    @Column(name = "noRegData")
    private Boolean noRegData;

    @Column(name = "enableAccessCodes")
    private Boolean enableAccessCodes;

    @Column(name = "imageName")
    private String imageName;

    @Column(name = "showTicketTypeCloseDate")
    private Date showTicketTypeCloseDate;

    @Column(name = "showTicketTypeOpenDate")
    private Date showTicketTypeOpenDate;

    @Column(name = "cyclingDateTime")
    private String cyclingDateTime;

    @Column(name = "cyclingDateUuid")
    private String cyclingDateUuid;

    @Column(name = "cyclingSubCategory")
    private String cyclingSubCategory;

}
