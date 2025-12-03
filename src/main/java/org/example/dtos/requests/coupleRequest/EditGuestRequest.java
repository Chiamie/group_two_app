package org.example.dtos.requests.coupleRequest;

import lombok.Data;

@Data
public class EditGuestRequest {

        private String id;
        private String guestName;
        private String guestEmail;
        private String guestContact;
        private String RSVP;

}
