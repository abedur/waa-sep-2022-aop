package edu.miu.lab3.controller;

import edu.miu.lab3.aspect.MyLogger;
import edu.miu.lab3.dto.ProductDto;
import edu.miu.lab3.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/products")
@RestController
@CrossOrigin
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    @MyLogger
    public List<ProductDto> getAll(){
        return productService.getAllProducts();
    }

    @MyLogger
    @GetMapping("/{id}")
    public ProductDto findById(@PathVariable int id){
        return  productService.findById(id);
    }

}
