package edu.miu.lab3.service.impl;

import edu.miu.lab3.dto.ProductDto;
import edu.miu.lab3.entity.Product;
import edu.miu.lab3.repo.IProductRepository;
import edu.miu.lab3.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class ProductServiceImpl implements ProductService {

    @Autowired
    private IProductRepository iProductRepository;

    private ModelMapper modelMapper;

    @Override
    public void save(Product p) {
        iProductRepository.save(p);
    }

    @Override
    public List<ProductDto> getAllProducts() {
        List<Product> products = (List<Product>) iProductRepository.findAll();
        return products.stream().map(s -> modelMapper.map(s, ProductDto.class)).collect(Collectors.toList());
    }

    @Override
    public ProductDto findById(int id) {
        var result = iProductRepository.findById(id);
        return modelMapper.map(result, ProductDto.class);
    }
}
