package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "stripetransfer")
public class Stripetransfer implements Serializable {

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

    @Column(name = "amount")
    private Long amount;

    @Column(name = "chargeId")
    private String chargeId;

    @Column(name = "currency")
    private String currency;

    @Column(name = "errorMessage")
    private String errorMessage;

    @Column(name = "orderId")
    private String orderId;

    @Column(name = "paidDate")
    private Date paidDate;

    @Column(name = "srrId")
    private Long srrId;

    @Column(name = "status")
    private String status;

    @Column(name = "stripeApiKey")
    private String stripeApiKey;

    @Column(name = "stripeClientId")
    private String stripeClientId;

    @Column(name = "stripeClientName")
    private String stripeClientName;

    @Column(name = "stripeId")
    private String stripeId;

    @Column(name = "operationId")
    private String operationId;

}
