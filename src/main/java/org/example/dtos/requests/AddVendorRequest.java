package org.example.dtos.requests;

import lombok.Data;

@Data
public class AddVendorRequest {
    private String coupleId;
    private String VendorName;
    private String contractAmount;
    private String vendorType;

}
