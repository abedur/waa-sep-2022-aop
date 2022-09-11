package edu.miu.lab3.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class MyUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

  /*  @OneToMany(mappedBy = "u1")
    private List<Review> reviews;*/
}
