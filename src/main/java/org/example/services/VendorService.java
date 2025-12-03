package org.example.services;

import org.example.dtos.requests.CreateContractRequest;
import org.example.dtos.requests.RegisterVendorRequest;
import org.example.dtos.requests.UpdateContractRequest;
import org.example.dtos.responses.CreateContractResponse;
import org.example.dtos.responses.RegisterVendorResponse;
import org.example.dtos.responses.UpdateContractResponse;

public interface VendorService {
    RegisterVendorResponse registerVendor(RegisterVendorRequest request);
    UpdateContractResponse updateContract(UpdateContractRequest request);
    CreateContractResponse createContract(CreateContractRequest request);
}
