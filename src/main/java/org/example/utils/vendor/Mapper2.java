package org.example.utils.vendor;

import org.example.data.models.Proposal;
import org.example.data.models.Vendor;
import org.example.dtos.requests.vendor.CreateProposalRequest;
import org.example.dtos.responses.vendor.CreateProposalResponse;
import org.example.dtos.responses.vendor.SendProposalResponse;


public class Mapper2 {


    public static CreateProposalResponse map(Vendor savedVendor){
        CreateProposalResponse response = new CreateProposalResponse();
        response.setProposalId(savedVendor.getProposal().getId());
        response.setServiceDescription(savedVendor.getProposal().getDescription());
        return response;
    }

    public static Proposal map(CreateProposalRequest request){
        Proposal proposal = new Proposal();
        proposal.setDescription(request.getServiceDescription());
        proposal.setVendorId(request.getVendorId());
        proposal.setWeddingId(request.getWeddingId());
        proposal.setCharge(request.getCharge());
        return proposal;
    }

    public static SendProposalResponse mapToSendProposal(Vendor foundVendor){
        SendProposalResponse response = new SendProposalResponse();
        response.setProposalDescription(foundVendor.getProposal().getDescription());
        return response;
    }
}