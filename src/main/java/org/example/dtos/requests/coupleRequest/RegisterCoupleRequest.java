package org.example.dtos.requests.coupleRequest;

import lombok.Data;
import org.example.data.models.Wedding;

@Data
public class RegisterCoupleRequest {

    private String coupleName;
    private String coupleEmail;
    private Wedding weddingPlan;
    private String password;


}
