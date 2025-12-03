package org.example.services.lakikiServices;

import lombok.NoArgsConstructor;
import org.example.data.models.Couple;
import org.example.data.models.Guest;
import org.example.data.repositories.CoupleRepository;
import org.example.data.repositories.GuestRepository;
import org.example.dtos.requests.coupleRequest.DeleteGuestRequest;
import org.example.dtos.requests.coupleRequest.EditGuestRequest;
import org.example.dtos.requests.coupleRequest.RegisterCoupleRequest;
import org.example.dtos.responses.coupleResponse.DeleteGuestResponse;
import org.example.dtos.responses.coupleResponse.EditGuestResponse;
import org.example.dtos.responses.coupleResponse.RegisterCoupleResponse;
import org.example.exceptions.exceptionMadeByCouple.CoupleExistException;
import org.example.exceptions.exceptionMadeByCouple.GuestExistException;
import org.example.utils.lakikiMappers.CoupleMappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@NoArgsConstructor
public class CoupleServiceImpl implements CoupleService {

    @Autowired
    private CoupleRepository coupleRepository;
    private GuestRepository guestRepository;


    @Override
    public RegisterCoupleResponse registerCouple(RegisterCoupleRequest request) {
            Optional<Couple> couple = CoupleMappers.map(request);

            if (!couple.isPresent()) {
                throw new CoupleExistException("User already exists");
            }

            Couple savedCouple = coupleRepository.save(couple.get());

            return CoupleMappers.response(savedCouple);
    }


    @Override
    public EditGuestResponse editGuest(EditGuestRequest request) {

        Optional<Guest> guest = guestRepository.findById(request.getId());

        if (!guest.isPresent()) throw new GuestExistException("Guest not found");

        Guest foundGuest = guest.get();

        foundGuest.setContact(request.getGuestContact());
        foundGuest.setEmail(request.getGuestEmail());
        foundGuest.setRSVP(request.getRSVP());

        Guest updated = guestRepository.save(foundGuest);

        return CoupleMappers.editGuest(updated);
    }

    @Override
    public DeleteGuestResponse removeGuest(DeleteGuestRequest request){

        Optional<Guest> guest = guestRepository.findById(request.getGuestId());
        if (guest.isEmpty()) throw new RuntimeException("Guest not found");

        guestRepository.deleteById(request.getGuestId());

        return CoupleMappers.removeGuest(request.getGuestId());
    }

}
