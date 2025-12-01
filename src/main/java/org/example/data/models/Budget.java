package org.example.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
public class Budget {
    @Id
    private String id;
    private String totalBudget;
    private String allocatedFunds;
    private String expenses;
}

