package com.example.graphql.repository;

import com.example.graphql.entity.Place;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceRepo extends JpaRepository<Place,Integer> {
}
