package org.example.dtos.requests;

import lombok.Data;

@Data
public class SendProposalRequest {
    private String proposalId;
    private String vendorId;
    private String coupleId;

}
