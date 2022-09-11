package edu.miu.lab3.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String name;
    private int price;
    private int rating;

   /* @ManyToOne
    private Category c1;
*/
}
