package org.example.services;

import lombok.NoArgsConstructor;
import org.example.dtos.requests.CreateContractRequest;
import org.example.dtos.requests.RegisterVendorRequest;
import org.example.dtos.requests.UpdateContractRequest;
import org.example.dtos.responses.CreateContractResponse;
import org.example.dtos.responses.RegisterVendorResponse;
import org.example.dtos.responses.UpdateContractResponse;
import org.example.exceptions.VendorNotFoundException;
import org.example.data.models.Vendor;
import org.example.data.repositories.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static org.example.utils.Mapper.*;

@Service
@NoArgsConstructor
public class VendorServiceImpl implements VendorService {

    @Autowired
    private VendorRepository vendorRepository;

    public VendorServiceImpl(VendorRepository vendorRepository) {
        this.vendorRepository = vendorRepository;
    }

    @Override
    public RegisterVendorResponse registerVendor(RegisterVendorRequest request) {
        Vendor vendor = map(request);
        Vendor savedVendor = vendorRepository.save(vendor);
        return mapVendorResponse(savedVendor);
    }

    @Override
    public UpdateContractResponse updateContract(UpdateContractRequest request) {
        Optional<Vendor> vendorOptional = vendorRepository.findById(request.vendorId);
        if (!vendorOptional.isPresent()) {
            throw new VendorNotFoundException("Vendor not found");
        }
        Vendor vendor = vendorOptional.get();
        Vendor updatedVendor = vendorRepository.save(vendor);
        return mapUpdateContractResponse(updatedVendor);
    }

    @Override
    public CreateContractResponse createContract(CreateContractRequest request) {
        Optional<Vendor> vendorOptional = vendorRepository.findById(request.vendorId);
        if (!vendorOptional.isPresent()) {
            throw new VendorNotFoundException("Vendor not found");
        }
        Vendor vendor = vendorOptional.get();
        Vendor updatedVendor = vendorRepository.save(vendor);
        return mapCreateContractResponse(updatedVendor, request);
    }
}
