package org.example.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class Booking {
    @Id
    private String id;
    private Contract contract;
    private boolean isBooked;
    private LocalDate bookingDate = LocalDate.now();

}
