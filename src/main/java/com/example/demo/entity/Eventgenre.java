package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "eventgenre")
public class Eventgenre implements Serializable {

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

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "defaultETicketTemplate")
    private String defaultETicketTemplate;

    @Column(name = "defaultEventPageTemplate")
    private String defaultEventPageTemplate;

    @Column(name = "getTicketTerm")
    private String getTicketTerm;

    @Column(name = "ticketTypeTerm")
    private String ticketTypeTerm;

    @Column(name = "orderCompleteSentToTerm")
    private String orderCompleteSentToTerm;

    @Column(name = "cyclingIntegration")
    private Boolean cyclingIntegration;

    @Column(name = "registrantFormTerm")
    private String registrantFormTerm;

    @Column(name = "registrantsTerm")
    private String registrantsTerm;

}
