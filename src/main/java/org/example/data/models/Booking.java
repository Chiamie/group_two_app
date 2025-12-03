package org.example.data.models;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;
import java.util.List;


@Data
@Document
public class Booking {
    @Id
    String id;
    private Contract contract;
    private boolean isBooked;
    private LocalDate bookingDate;
}
