package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "fundraisingtransfertobenefactor")
public class Fundraisingtransfertobenefactor implements Serializable {

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

    @Column(name = "donorPaymentId")
    private Long donorPaymentId;

    @Column(name = "platformFee")
    private BigDecimal platformFee;

    @Column(name = "stripeTransferId")
    private String stripeTransferId;

    @Column(name = "transferAmount")
    private BigDecimal transferAmount;

    @Column(name = "benefactorId")
    private Long benefactorId;

    @Column(name = "campaignId")
    private Long campaignId;

    @Column(name = "pageId")
    private Long pageId;

    @Column(name = "platformFeeEur")
    private BigDecimal platformFeeEur;

    @Column(name = "transferAmountEur")
    private BigDecimal transferAmountEur;

    @Column(name = "conversionRate")
    private BigDecimal conversionRate;

    @Column(name = "coverBankingCharges")
    private Boolean coverBankingCharges;

    @Column(name = "platformFeeCoveredByDonor")
    private BigDecimal platformFeeCoveredByDonor;

    @Column(name = "platformFeeCoveredByDonorEur")
    private BigDecimal platformFeeCoveredByDonorEur;

}
