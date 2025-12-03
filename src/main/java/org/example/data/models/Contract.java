package org.example.data.models;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class Contract {
    private String id;
    private String vendorId;
    private String  weddingId;
    private String  proposalId;
    private LocalDateTime contractDate = LocalDateTime.now();
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String serviceDescription;
    private Policy paymentTerms;
    private Policy cancellationPolicy;
    private boolean status;
}
