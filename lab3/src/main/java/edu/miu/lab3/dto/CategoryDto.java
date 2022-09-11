package edu.miu.lab3.dto;

import edu.miu.lab3.entity.Product;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class CategoryDto {
    @Id
    private int id;
    private String name;

    @OneToMany(mappedBy = "c1")
    private List<Product> products;
}
