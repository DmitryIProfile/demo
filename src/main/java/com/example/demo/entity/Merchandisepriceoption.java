package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "merchandisepriceoption")
public class Merchandisepriceoption implements Serializable {

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

    @Column(name = "merchandiseId")
    private Long merchandiseId;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "uuid")
    private String uuid;

    @Column(name = "quantity")
    private Long quantity;

    @Column(name = "boxofficeQuantity")
    private Long boxofficeQuantity;

    @Column(name = "displayOptionalField")
    private Boolean displayOptionalField;

    @Column(name = "displayVariants")
    private Boolean displayVariants;

    @Column(name = "noMinimalFeeOverride")
    private Boolean noMinimalFeeOverride;

}
