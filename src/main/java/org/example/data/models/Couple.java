package org.example.data.models;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document
public class Couple {
    @Id
    private String id;
    private String name;
    private String email;
    private Wedding weddingPlan;
    private String password;
}
