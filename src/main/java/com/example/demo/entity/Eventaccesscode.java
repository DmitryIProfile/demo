package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "eventaccesscode")
public class Eventaccesscode implements Serializable {

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

    @Column(name = "code")
    private String code;

    @Column(name = "completeDate")
    private Date completeDate;

    @Column(name = "eventId")
    private Long eventId;

    @Column(name = "providedDate")
    private Date providedDate;

    @Column(name = "status")
    private String status;

    @Column(name = "bookingId")
    private Long bookingId;

    @Column(name = "orderId")
    private Long orderId;

    @Column(name = "ticketTypeId")
    private Long ticketTypeId;

    @Column(name = "ticketTypeId2")
    private Long ticketTypeId2;

    @Column(name = "accessRestrictionId")
    private Long accessRestrictionId;

    @Column(name = "restrictionId")
    private Long restrictionId;

}
