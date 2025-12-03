package org.example.dtos.requests;

import lombok.Data;


@Data
public class CreateWeddingRequest {
        private String coupleId;
        private String name;
        private String weddingDate;
        private String weddingLocation;
        private String budget;
    }



