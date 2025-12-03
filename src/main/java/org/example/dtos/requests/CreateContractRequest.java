package org.example.dtos.requests;
import org.example.data.models.Policy;

import java.time.LocalDateTime;

public class CreateContractRequest {
    public String vendorId;
    public String weddingId;
    public String proposalId;
    public LocalDateTime startDate;
    public LocalDateTime endDate;
    public String serviceDescription;
    public Policy paymentPolicy;
    public Policy cancellationPolicy;
}