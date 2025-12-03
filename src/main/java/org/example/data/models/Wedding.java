package org.example.data.models;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;

@Data
public class Wedding {
    @Id
    private String id;
    private LocalDateTime date;
    private String name;
    private Budget weddingBudget;
    private List<Guest> guests;
//    private List<Vendor> vendors;
    private List<HashMap<Vendor, Status>> vendors;
    private Checklist taskchecklist;
    private String location;
    private List<Proposal> proposals;



}





