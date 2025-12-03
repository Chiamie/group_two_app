package org.example.services.lakikiServices;

import org.example.dtos.requests.coupleRequest.DeleteGuestRequest;
import org.example.dtos.requests.coupleRequest.EditGuestRequest;
import org.example.dtos.requests.coupleRequest.RegisterCoupleRequest;
import org.example.dtos.responses.coupleResponse.DeleteGuestResponse;
import org.example.dtos.responses.coupleResponse.EditGuestResponse;
import org.example.dtos.responses.coupleResponse.RegisterCoupleResponse;

public interface CoupleService {

    RegisterCoupleResponse registerCouple(RegisterCoupleRequest request);
    EditGuestResponse editGuest(EditGuestRequest request);
    DeleteGuestResponse removeGuest(DeleteGuestRequest request);
}
