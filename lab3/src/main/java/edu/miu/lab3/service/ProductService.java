package edu.miu.lab3.service;

import edu.miu.lab3.dto.ProductDto;
import edu.miu.lab3.entity.Product;

import java.util.List;

public interface ProductService {
    void save(Product p);

    List<ProductDto> getAllProducts();

    ProductDto findById(int id);
}
