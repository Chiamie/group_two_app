package org.example.data.models;
import lombok.Data;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;

@Data
public class Proposal {
    @Id
    private String id;
    private String description;
    private boolean status;
    private String vendorId;
    private String weddingId;
    private double charge;
    private LocalDate date;
}

