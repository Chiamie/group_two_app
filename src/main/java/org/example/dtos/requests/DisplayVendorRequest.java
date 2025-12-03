package org.example.dtos.requests;

import lombok.Data;
import org.example.data.models.Contract;

import java.util.List;

@Data
public class DisplayVendorRequest {
    private String coupleId;
    private String vendorName;
    private String vendorType;
    private List<Contract> contract;
}
