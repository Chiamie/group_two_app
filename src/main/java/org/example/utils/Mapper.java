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



}
