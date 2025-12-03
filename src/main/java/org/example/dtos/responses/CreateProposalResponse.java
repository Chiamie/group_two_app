package org.example.dtos.responses;

import lombok.Data;
import org.example.data.models.Policy;

import java.time.LocalDateTime;
@Data
public class CreateProposalResponse {
    private String proposalId;
    private String weddingId;
    private String ContractDate;
    private String ContractEndDate;
    private String ContractStartDate;
    private String ServiceDescription;
    private Policy paymentTerms;
    private Policy cancellationPolicy;
}
