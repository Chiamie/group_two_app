package org.example.services;

import org.example.dtos.requests.CreateContractRequest;
import org.example.dtos.requests.RegisterVendorRequest;
import org.example.dtos.requests.UpdateContractRequest;
import org.example.dtos.responses.RegisterVendorResponse;

public interface VendorService {
    RegisterVendorResponse registerVendor(RegisterVendorRequest request);
    RegisterVendorResponse updateContract(UpdateContractRequest request);
    RegisterVendorResponse createContract(CreateContractRequest request);
}


