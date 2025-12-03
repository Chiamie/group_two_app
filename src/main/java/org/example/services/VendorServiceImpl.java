package org.example.services;
import lombok.NoArgsConstructor;
import org.example.dtos.requests.CreateContractRequest;
import org.example.dtos.requests.UpdateContractRequest;
import org.example.exceptions.VendorNotFoundException;
import org.example.data.models.Vendor;
import org.example.data.repositories.VendorRepository;
import org.example.dtos.requests.RegisterVendorRequest;
import org.example.dtos.responses.RegisterVendorResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

import static org.example.utils.Mapper.map;
import static org.example.utils.Mapper.mapVendorResponse;

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
    public RegisterVendorResponse updateContract(UpdateContractRequest request) {
            Optional<Vendor> vendorOptional = vendorRepository.findById(request.vendorId);
            if (!vendorOptional.isPresent()) {
                throw new VendorNotFoundException("Vendor not found");
            }
            Vendor vendor = vendorOptional.get();
            Vendor updatedVendor = vendorRepository.save(vendor);
            return mapVendorResponse(updatedVendor);
        }


    @Override
    public RegisterVendorResponse createContract(CreateContractRequest request) {
            Optional<Vendor> vendorOptional = vendorRepository.findById(request.vendorId);
            if (!vendorOptional.isPresent()) {
                throw new VendorNotFoundException("Vendor not found");
            }
            Vendor vendor = vendorOptional.get();
            Vendor updatedVendor = vendorRepository.save(vendor);
            return mapVendorResponse(updatedVendor);
        }
    }



