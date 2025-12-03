package org.example.dtos.responses.vendor;

import lombok.Data;
import org.example.data.models.Policy;

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
