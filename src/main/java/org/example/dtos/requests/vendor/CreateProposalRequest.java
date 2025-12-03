package org.example.dtos.requests.vendor;

import lombok.Data;

@Data
public class CreateProposalRequest {
    private String serviceDescription;
    private String vendorId;
    private String weddingId;
    private double charge;
}
