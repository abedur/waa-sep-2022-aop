package edu.miu.lab3.dto;

import edu.miu.lab3.entity.Category;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
@Data
public class ProductDto {
    @Id
    private int id;
    private String name;
    private int price;
    private int rating;

    @ManyToOne
    private Category c1;

}
