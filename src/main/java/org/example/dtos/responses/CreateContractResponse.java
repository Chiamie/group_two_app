package org.example.dtos.responses;
import org.example.data.models.Policy;

import java.time.LocalDateTime;

public class CreateContractResponse {
    public String id;
    public String vendorId;
    public String weddingId;
    public String proposalId;
    public LocalDateTime contractDate;
    public LocalDateTime startDate;
    public LocalDateTime endDate;
    public String serviceDescription;
    public Policy paymentPolicy;
    public Policy cancellationPolicy;
    public boolean status;
}