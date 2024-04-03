package com.example.supermarket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.supermarket.model.Product;
import com.example.supermarket.service.ProductService;

@RestController
public class ProductController {
    @Autowired

    ProductService ps;

    @PostMapping("/addproduct")                                                 //CREATE OPERATION                             
    public ResponseEntity<Product> add(@RequestBody Product p) {

        Product newproject = ps.create(p);
        return new ResponseEntity<>(newproject, HttpStatus.CREATED);
    }

    @GetMapping("/showproduct")                                                 //READ OPERATION
    public ResponseEntity<List<Product>> show() {

        List<Product> obj = ps.getAlldetails();
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @PutMapping("/api/product/{productId}")
    public ResponseEntity<Product> putMethodName(@PathVariable("productId") int id, @RequestBody Product employee) {
        if(ps.updateDetails(id,employee) == true)
        {
            return new ResponseEntity<>(employee,HttpStatus.OK);
        }
        
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/api/product/{productId}")
    public ResponseEntity<Boolean> delete(@PathVariable("productId") int id)
    {
        if(ps.deleteUser(id) == true)
        {
            return new ResponseEntity<>(true,HttpStatus.OK);
        }
        return new ResponseEntity<>(false,HttpStatus.NOT_FOUND);
    }

}
