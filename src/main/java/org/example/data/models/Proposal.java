package org.example.data.models;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Proposal {
    private String id;
    private String description;
    private boolean status;
    private String vendorId;
    private String weddingId;
    private double charge;
    private LocalDate date = LocalDate.now();
}
