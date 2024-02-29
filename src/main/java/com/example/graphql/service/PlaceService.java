package com.example.graphql.service;

import com.example.graphql.entity.Place;
import com.example.graphql.repository.PlaceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaceService {

    @Autowired
    private PlaceRepo placeRepo;

    public Place create(Place place){
        return placeRepo.save(place);
    }

    public List<Place> getAll(){
        List<Place> place = placeRepo.findAll();
        return place;
    }

    public Place getById(int id){
        Place place = placeRepo.findById(id).get();
        return place;
    }
}
