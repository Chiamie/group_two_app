package org.example.utils;

import org.example.data.models.*;
import org.example.dtos.requests.CreateProposalRequest;
import org.example.dtos.responses.CreateProposalResponse;
import org.example.dtos.responses.SendProposalResponse;

public class Mapper {


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