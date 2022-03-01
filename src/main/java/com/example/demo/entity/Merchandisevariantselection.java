package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "merchandisevariantselection")
public class Merchandisevariantselection implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "merchadiseSelectionId")
    private Long merchadiseSelectionId;

    @Column(name = "merchadiseVariantId")
    private Long merchadiseVariantId;

}
