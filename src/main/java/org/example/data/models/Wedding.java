package org.weddingPlanner.data.models;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document
@Data
public class Wedding {
    @Id
    private String id;
    private String name;
    private LocalDateTime date;
    private Budget weddingBudget;
    private List<Guest> guests;
    private List<Vendor> vendors;

    private List<Task> taskChecklist;
    private Checklist taskchecklist;

    private String location;
}





