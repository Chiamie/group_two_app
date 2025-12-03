package org.example.utils.lakikiMappers;

import org.example.data.models.Couple;
import org.example.data.models.Guest;
import org.example.dtos.requests.coupleRequest.EditGuestRequest;
import org.example.dtos.requests.coupleRequest.RegisterCoupleRequest;
import org.example.dtos.responses.coupleResponse.DeleteGuestResponse;
import org.example.dtos.responses.coupleResponse.EditGuestResponse;
import org.example.dtos.responses.coupleResponse.RegisterCoupleResponse;

import java.util.Optional;

public class CoupleMappers {





        public static Optional<Couple> map(RegisterCoupleRequest request){

            Couple couple = new Couple();

            couple.setName(request.getCoupleName());
            couple.setEmail(request.getCoupleEmail());
            couple.setPassword(request.getPassword());

            return Optional.of(couple);
        }

        public static RegisterCoupleResponse response(Couple couple){

            RegisterCoupleResponse response = new RegisterCoupleResponse();

            response.setId(couple.getId());
            response.setCoupleName(couple.getName());
            response.setCoupleEmail(couple.getEmail());
            response.setMessage("Couple registered successfully");

            return response;
        }

        public static Optional<Guest> guestMap(EditGuestRequest request){
            Guest guest = new Guest();

            guest.setEmail(request.getGuestEmail());
            guest.setRSVP(request.getRSVP());
            guest.setContact(request.getGuestContact());

            return Optional.of(guest);
        }
        public static EditGuestResponse editGuest(Guest guest){

            EditGuestResponse response = new EditGuestResponse();

            response.setId(guest.getId());
            response.setGuestContact(guest.getContact());
            response.setGuestEmail(guest.getEmail());
            response.setMessage("Guest updated successfully");

            return response;
        }

        public static DeleteGuestResponse removeGuest(String guestId){

        DeleteGuestResponse response = new DeleteGuestResponse();
        response.setGuestId(guestId);
        response.setMessage("Guest removed successfully");

        return response;
    }

}



