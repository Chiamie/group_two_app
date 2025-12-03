package org.example.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.ArrayList;
import java.util.List;

import java.util.List;

@Data
@Document
public class Vendor {
    private String id;
    private String location;
    private String name;
    private Type type;
    private double price;


}
