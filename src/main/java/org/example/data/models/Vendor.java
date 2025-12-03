package org.example.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.ArrayList;
import java.util.List;

@Data
@Document
public class Vendor {
    private String id;
    @Id
    private String contactInfo;
    private String name;
    private List<Booking> bookings = new ArrayList<>();
    private List<Contract> contracts = new ArrayList<>();
    private Type type;
    private Proposal proposal;
}
