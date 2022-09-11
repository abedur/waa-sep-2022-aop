package edu.miu.lab3.dto;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data

public class AddressDto {
    @Id
    private int id;
    private String street;
    private String zip;
    private String city;
}
