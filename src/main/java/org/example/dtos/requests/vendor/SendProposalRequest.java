package org.example.dtos.requests.vendor;

import lombok.Data;

@Data
public class SendProposalRequest {
    private String proposalId;
    private String vendorId;
    private String coupleId;

}
