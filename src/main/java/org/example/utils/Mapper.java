package org.example.utils;

import org.example.data.models.Type;
import org.example.data.models.Vendor;
import org.example.data.models.Wedding;
import org.example.dtos.requests.AddVendorRequest;
import org.example.dtos.requests.CreateWeddingRequest;
import org.example.dtos.responses.AddVendorResponse;
import org.example.dtos.responses.CreateWeddingResponse;
import org.example.dtos.responses.DisplayVendorResponse;

import java.time.LocalDateTime;

public class Mapper {
    public static Wedding map(CreateWeddingRequest request ){
        Wedding wedding = new Wedding();
        wedding.setName(request.getName());
        wedding.setDate(LocalDateTime.parse(request.getWeddingDate()));
        wedding.setLocation(request.getWeddingLocation());
        return wedding;
    }

    public static CreateWeddingResponse map(Wedding wedding){
        CreateWeddingResponse response = new CreateWeddingResponse();
        response.setWeddingId(wedding.getId());
        response.setWeddingName(wedding.getName());
        response.setWeddingLocation(wedding.getLocation());
        response.setWeddingDate(wedding.getDate() + "");
        return response;
    }



import org.example.data.models.Vendor;
import org.example.dtos.requests.RegisterVendorRequest;
import org.example.dtos.responses.RegisterVendorResponse;
import org.example.dtos.requests.CreateContractRequest;
import org.example.dtos.responses.CreateContractResponse;
import org.example.dtos.responses.UpdateContractResponse;

public class Mapper {
    public static Vendor map(RegisterVendorRequest request) {
        Vendor vendor = new Vendor();
        vendor.setName(request.getName());
        vendor.setContactInfo(request.getContactInfo());
        vendor.setType(request.getType());
        return vendor;
    }

    public static RegisterVendorResponse mapVendorResponse(Vendor savedVendor) {
        RegisterVendorResponse response = new RegisterVendorResponse();
        response.Id = savedVendor.getId();
        response.name = savedVendor.getName();
        response.contactInfo = savedVendor.getContactInfo();
        response.type = savedVendor.getType();
        return response;
    }

    public static UpdateContractResponse mapUpdateContractResponse(Vendor updatedVendor) {
        UpdateContractResponse response = new UpdateContractResponse();
        response.id = updatedVendor.getId();
        response.message = "Contract updated successfully";
        return response;
    }

    public static CreateContractResponse mapCreateContractResponse(Vendor updatedVendor, CreateContractRequest request) {
        CreateContractResponse response = new CreateContractResponse();
        response.id = updatedVendor.getId();
        response.vendorId = request.vendorId;
        response.weddingId = request.weddingId;
        response.proposalId = request.proposalId;
        response.startDate = request.startDate;
        response.endDate = request.endDate;
        response.serviceDescription = request.serviceDescription;
        response.paymentPolicy = request.paymentPolicy;
        response.cancellationPolicy = request.cancellationPolicy;
        response.status = true;
        return response;
    }
}
