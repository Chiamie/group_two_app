package org.example.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Policy {
    @Id
    private String id;
    private String description;
}