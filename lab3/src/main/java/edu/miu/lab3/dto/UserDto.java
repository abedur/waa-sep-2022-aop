package edu.miu.lab3.dto;

import edu.miu.lab3.entity.Review;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class UserDto {
    @Id
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    @OneToMany(mappedBy = "u1")
    private List<ReviewDto> reviews;

}
