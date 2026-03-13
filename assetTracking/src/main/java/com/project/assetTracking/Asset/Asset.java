package com.project.assetTracking.Asset;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "assets")
@Data
public class Asset {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String type;

    private boolean deleted = false;

}
