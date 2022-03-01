package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "fundraisingpage")
public class Fundraisingpage implements Serializable {

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

    @Column(name = "campaignId")
    private Long campaignId;

    @Column(name = "pageCustomText")
    private String pageCustomText;

    @Column(name = "pageId")
    private String pageId;

    @Column(name = "sourceEventId")
    private Long sourceEventId;

    @Column(name = "sourceType")
    private String sourceType;

    @Column(name = "target")
    private BigDecimal target;

    @Column(name = "userId")
    private Long userId;

    @Column(name = "fundraiserName")
    private String fundraiserName;

    @Column(name = "currency")
    private String currency;

    @Column(name = "uuid")
    private String uuid;

    @Column(name = "milestone1")
    private Boolean milestone1;

    @Column(name = "milestone2")
    private Boolean milestone2;

    @Column(name = "milestone3")
    private Boolean milestone3;

    @Column(name = "milestone4")
    private Boolean milestone4;

    @Column(name = "milestone5")
    private Boolean milestone5;

    @Column(name = "milestone6")
    private Boolean milestone6;

    @Column(name = "milestoneHalf")
    private Boolean milestoneHalf;

    @Column(name = "milestoneTarget")
    private Boolean milestoneTarget;

    @Column(name = "ticketId")
    private Long ticketId;

    @Column(name = "uploadUuid")
    private String uploadUuid;

    @Column(name = "currentMotivationEmailNumber")
    private Integer currentMotivationEmailNumber;

    @Column(name = "lastMilestoneEmailDate")
    private Date lastMilestoneEmailDate;

}
