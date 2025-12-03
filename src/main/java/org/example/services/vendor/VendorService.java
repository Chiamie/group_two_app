package org.example.services.vendor;

import org.example.dtos.requests.CreateProposalRequest;
import org.example.dtos.requests.SendProposalRequest;
import org.example.dtos.responses.CreateProposalResponse;
import org.example.dtos.responses.SendProposalResponse;

public interface VendorService {
     CreateProposalResponse createProposal(CreateProposalRequest request);
     SendProposalResponse sendProposal(SendProposalRequest request);

}
