package com.example.graphql.entity;

import jakarta.persistence.Column;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PlaceInput {
    private String name;
    private String address;
    private String state;
}
