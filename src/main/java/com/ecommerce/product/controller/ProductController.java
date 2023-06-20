package com.ecommerce.product.controller;

import com.ecommerce.product.dto.RequestDto;
import com.ecommerce.product.model.Product;
import com.ecommerce.product.service.ProductService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @ApiResponse(responseCode = "200", description = "Products found")
    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts() {
        return new ResponseEntity<>(
                this.productService.getAllProducts(), HttpStatus.OK
        );
    }

    @ApiResponse(responseCode = "200", description = "Product found")
    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable String id) {
        return new ResponseEntity<>(
                this.productService.getProductById(id), HttpStatus.OK
        );
    }

    @ApiResponse(responseCode = "201", description = "Product Created")
    @PostMapping("/product")
    @ResponseStatus(HttpStatus.CREATED)
    public void addProduct(@Valid @RequestBody RequestDto requestDto) {
        productService.createProduct(requestDto);
    }

    @ApiResponse(responseCode = "200", description = "Products found")
    @GetMapping("/products/{category}")
    public ResponseEntity<List<Product>> getProductByCategory(@Valid @PathVariable String category) {
        return new ResponseEntity<>(
                this.productService.getProductByCategory(category), HttpStatus.OK
        );
    }
   @ApiResponse(responseCode = "200", description = "Product Deleted")
    @DeleteMapping("/product/{id}")
    public ResponseEntity<Boolean> deleteProductById(@Valid @PathVariable String id) {

        try{
            return new ResponseEntity<>(
                    this.productService.deleteProductById(id), HttpStatus.OK
            );
        }catch (Exception e){
            return new ResponseEntity<>(
                    false, HttpStatus.INTERNAL_SERVER_ERROR
            );
        }
    }
}
