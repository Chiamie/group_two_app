package org.example.dtos.requests;

import lombok.Data;
import org.example.data.models.Policy;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Data
public class CreateProposalRequest {
    private String serviceDescription;
    private String vendorId;
    private String weddingId;
    private double charge;
}
