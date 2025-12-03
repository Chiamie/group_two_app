package org.example.utils;
import org.example.data.models.Type;
import org.example.data.models.Vendor;
import org.example.dtos.requests.RegisterVendorRequest;
import org.example.dtos.responses.RegisterVendorResponse;

public class Mapper {
    public static Vendor map(RegisterVendorRequest request) {
        Vendor vendor = new Vendor();
        vendor.setName(request.getName());
        vendor.setContactInfo(request.getContactInfo());
        vendor.setType(String.valueOf(request.getType()));
        return vendor;
    }

    public static RegisterVendorResponse mapVendorResponse(Vendor savedVendor) {
        RegisterVendorResponse vendorResponse = new RegisterVendorResponse();
        vendorResponse.setId(savedVendor.getId());
        vendorResponse.setName(savedVendor.getName());
        vendorResponse.setContactInfo(savedVendor.getContactInfo());
        vendorResponse.setType(Type.valueOf(savedVendor.getType()));
        return vendorResponse;
    }
}

