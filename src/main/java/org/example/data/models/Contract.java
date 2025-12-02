package org.example.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Data
@Document(collection = "contracts")
public class Contract {
    @Id
    private String id;
    private String vendorId;
    private String weddingId;
    private String proposalId;
    private LocalDateTime contractDate;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String serviceDescription;
    private Policy paymentPolicy;
    private Policy cancellationPolicy;
    private boolean status;
}