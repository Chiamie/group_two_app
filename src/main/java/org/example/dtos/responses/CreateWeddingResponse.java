package org.example.dtos.responses;

import lombok.Data;


import java.time.LocalDateTime;

@Data
public class CreateWeddingResponse {
        private String weddingId;
        private String weddingName;
        private String weddingLocation;
        private String weddingDate;
}






