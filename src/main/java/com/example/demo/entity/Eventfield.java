package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "eventfield")
public class Eventfield implements Serializable {

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

    @Column(name = "code", nullable = false)
    private String code;

    @Column(name = "defaultValue")
    private String defaultValue;

    @Column(name = "eventId")
    private Long eventId;

    @Column(name = "label", nullable = false)
    private String label;

    @Column(name = "mobilenoCountry")
    private String mobilenoCountry;

    @Column(name = "required")
    private Boolean required;

    @Column(name = "sortIndex")
    private Long sortIndex;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "visible")
    private Boolean visible;

    @Column(name = "autoextendableDropdownCode")
    private String autoextendableDropdownCode;

    @Column(name = "isAutoextendable")
    private Boolean isAutoextendable;

    @Column(name = "hideByDefault")
    private Integer hideByDefault;

    @Column(name = "hideConditions")
    private String hideConditions;

    @Column(name = "showConditions")
    private String showConditions;

    @Column(name = "sectionId")
    private Long sectionId;

    @Column(name = "information")
    private String information;

    @Column(name = "textCharactersOnly")
    private Boolean textCharactersOnly;

    @Column(name = "textRegexpressions")
    private String textRegexpressions;

    @Column(name = "maxAllowedNumber")
    private BigDecimal maxAllowedNumber;

    @Column(name = "minAllowedNumber")
    private BigDecimal minAllowedNumber;

    @Column(name = "allowedLength")
    private Long allowedLength;

    @Column(name = "sorting")
    private Boolean sorting;

    @Column(name = "requiredBoxoffice")
    private Boolean requiredBoxoffice;

    @Column(name = "requiredOnline")
    private Boolean requiredOnline;

    @Column(name = "visibleBoxoffice")
    private Boolean visibleBoxoffice;

    @Column(name = "visibleOnline")
    private Boolean visibleOnline;

    @Column(name = "isMilliseconds")
    private Boolean isMilliseconds;

    @Column(name = "restrictedByAvlQty")
    private Boolean restrictedByAvlQty;

    @Column(name = "enabledAutoFilling")
    private Boolean enabledAutoFilling;

    @Column(name = "restrictDateTime")
    private Date restrictDateTime;

    @Column(name = "restrictQuantity")
    private BigDecimal restrictQuantity;

    @Column(name = "restrictType")
    private String restrictType;

    @Column(name = "fieldDictionaryId")
    private Long fieldDictionaryId;

    @Column(name = "enableDropdownRemainingDisplay")
    private Boolean enableDropdownRemainingDisplay;

    @Column(name = "formatDateOfBirthday")
    private String formatDateOfBirthday;

    @Column(name = "disableMMBEditing")
    private Boolean disableMMBEditing;

    @Column(name = "disableDate")
    private Date disableDate;

    @Column(name = "countryCode")
    private String countryCode;

    @Column(name = "maxTeamSize")
    private Long maxTeamSize;

    @Column(name = "autoextendableUnique")
    private Boolean autoextendableUnique;

    @Column(name = "parentDropdownId")
    private Long parentDropdownId;

    @Column(name = "parentDropdownCode")
    private String parentDropdownCode;

}
