package org.example.dtos.responses.coupleResponse;

import lombok.Data;
import org.example.data.models.Wedding;

@Data
public class RegisterCoupleResponse {

    private String id;
    private String coupleName;
    private String coupleEmail;
    private Wedding weddingPlan;
    private String message;

}
