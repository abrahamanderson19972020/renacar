package com.example.rentACAr.webApi.controllers;

import com.example.rentACAr.business.abstracts.BrandService;
import com.example.rentACAr.business.requests.CreateBrandRequest;
import com.example.rentACAr.business.responses.GetAllBrandsResponse;
import com.example.rentACAr.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // annotation
@RequestMapping("/api/brands")
public class BrandsController {
    private BrandService brandService;
    @Autowired
    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }
    @GetMapping("/getAll")
    public List<GetAllBrandsResponse> GetAllBrands(){
        return brandService.BusinessGetBrands();
    }

   @PostMapping void add(CreateBrandRequest createBrandRequest)
   {
       this.brandService.add(createBrandRequest);
   }
}
