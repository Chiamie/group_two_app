package org.weddingPlanner.data.models;



import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Budget {
    @Id
    private String id;
    private String totalBudget;
    private String allocatedBudget;
    private String expenses;
}

