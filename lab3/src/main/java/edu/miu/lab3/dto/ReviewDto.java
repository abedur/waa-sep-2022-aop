package edu.miu.lab3.dto;

import edu.miu.lab3.entity.MyUser;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
public class ReviewDto {
    @Id
    private int id;
    private String comments;

    @ManyToOne
    private MyUser u1;
}
