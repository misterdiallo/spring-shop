package com.misterdiallo.backend.productservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    // Create new Product
    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void createProduct() {

    }

    // List all Products


}
