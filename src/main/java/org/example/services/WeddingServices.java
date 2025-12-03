package org.example.services;

import org.example.dtos.requests.AddVendorRequest;
import org.example.dtos.requests.CreateWeddingRequest;
import org.example.dtos.requests.DisplayVendorRequest;
import org.example.dtos.responses.AddVendorResponse;
import org.example.dtos.responses.CreateWeddingResponse;
import org.example.dtos.responses.DisplayVendorResponse;


public interface WeddingServices {
  CreateWeddingResponse createWedding(CreateWeddingRequest request);
  AddVendorResponse addVendor(AddVendorRequest request);
  DisplayVendorResponse displayVendors(DisplayVendorRequest request);

}
