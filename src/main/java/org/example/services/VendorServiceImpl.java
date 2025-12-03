package org.example.services;

import org.example.data.models.Couple;
import org.example.data.models.Proposal;
import org.example.data.models.Vendor;
import org.example.data.repositories.CoupleRepository;
import org.example.data.repositories.VendorRepository;
import org.example.dtos.requests.CreateProposalRequest;
import org.example.dtos.requests.SendProposalRequest;
import org.example.dtos.responses.CreateProposalResponse;
import org.example.dtos.responses.SendProposalResponse;
import org.example.exceptions.VendorNotFound;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

import static org.example.utils.Mapper.map;
import static org.example.utils.Mapper.mapToSendProposal;

public class VendorServiceImpl {

    @Autowired
    private VendorRepository vendorRepository;

    @Autowired
    private CoupleRepository coupleRepository;


    public CreateProposalResponse createProposal(CreateProposalRequest request) {

        Optional<Vendor> vendor = vendorRepository.findById(request.getVendorId());
        if (vendor.isEmpty()) throw new VendorNotFound("Vendor Not Found");
        Vendor vendorFound = vendor.get();

        Proposal proposal = map(request);
        vendorFound.setProposal(proposal);
        Vendor savedVendor = vendorRepository.save(vendorFound);
        return map(savedVendor);
    }

    public SendProposalResponse sendProposal(SendProposalRequest request){
       Optional <Vendor> vendor = vendorRepository.findById(request.getVendorId());
       if (vendor.isEmpty()) throw new VendorNotFound("Vendor Not Found");
       Vendor foundVendor = vendor.get();

       Optional <Couple> couple = coupleRepository.findById(request.getCoupleId());
       if (couple.isEmpty()) throw new VendorNotFound("Couple Not Found");
       Couple foundCouple = couple.get();

       foundCouple.getWeddingPlan().getProposals().add(foundVendor.getProposal());
       coupleRepository.save(foundCouple);

       return mapToSendProposal(foundVendor);
    }


}
