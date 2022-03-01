package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "registrantdata")
public class Registrantdata implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "code")
    private String code;

    @Column(name = "fieldTemplateId")
    private Long fieldTemplateId;

    @Column(name = "registrantFormId")
    private Long registrantFormId;

    @Column(name = "value")
    private String value;

}
