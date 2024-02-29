package com.example.graphql.controller;

import com.example.graphql.entity.Place;
import com.example.graphql.entity.PlaceInput;
import com.example.graphql.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlaceController {

    @Autowired
    private PlaceService placeService;

    @MutationMapping
    public Place create(@Argument PlaceInput place){
        Place place1 = new Place();
        place1.setAddress(place.getAddress());
        place1.setName(place.getName());
        place1.setState(place.getState());
        return placeService.create(place1);
    }

    @QueryMapping
    public List<Place> getALl(){
        List<Place> place =  placeService.getAll();
        return place;
    }

    @QueryMapping
    public Place getId(@Argument int id){
        return placeService.getById(id);
    }
}
