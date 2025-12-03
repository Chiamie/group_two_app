package org.example.services;

import org.example.data.models.Couple;
import org.example.data.models.Wedding;
import org.example.data.repositories.CoupleRepository;
import org.example.data.repositories.VendorRepository;
import org.example.data.repositories.WeddingRepository;
import org.example.dtos.requests.CreateWeddingRequest;
import org.example.dtos.responses.CreateWeddingResponse;
import org.example.exceptions.CoupleNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

import static org.example.utils.Mapper.map;


@Service
public class WeddingServicesImpl {

    @Autowired
    private WeddingRepository weddingRepository;

    @Autowired
    private CoupleRepository coupleRepository;

    @Autowired
    private VendorRepository vendorRepository;


    public CreateWeddingResponse createWedding(CreateWeddingRequest request) {
        Optional<Couple> couple = coupleRepository.findById(request.getCoupleId());

        if (couple.isEmpty()) {
            throw new CoupleNotFoundException("Couple with" + request.getCoupleId() + "ID Not found");
        }

        Couple foundCouple = couple.get();
        Wedding wedding = map(request);
        Wedding savedWedding = weddingRepository.save(wedding);

        foundCouple.setWeddingPlan(savedWedding);

        return map(savedWedding);
    }

}
