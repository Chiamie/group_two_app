package org.example.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
public class Vendor {
    private String id;
    private String contactInfo;
    private String name;

    private String type;
}