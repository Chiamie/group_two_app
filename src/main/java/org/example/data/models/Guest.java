package org.example.data.models;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
public class Guest {
    @Id
    private String id;
    private String contact;
    private String email;
    private String RSVP;

}
