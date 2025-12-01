package org.example.data.models;


import lombok.Data;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
public class Task {
    private String id;
    private String description;
    private LocalDateTime dueDate;
    private boolean status;
    private String RSVP;
}
