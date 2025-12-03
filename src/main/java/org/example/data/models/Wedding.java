package org.example.data.models;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Document
public class Wedding {
    @Id
    private String id;
    private LocalDateTime date;
    private String name;
    private Budget weddingBudget;
    private String brideName;
    private String groomName;
    private List<Guest> guests;
    private List<Vendor> vendors;
    private List<Proposal> proposals;
    private Checklist taskchecklist;
    private String location;


}





