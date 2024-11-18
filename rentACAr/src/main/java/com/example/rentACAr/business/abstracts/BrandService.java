package com.example.rentACAr.business.abstracts;

import com.example.rentACAr.business.requests.CreateBrandRequest;
import com.example.rentACAr.business.responses.GetAllBrandsResponse;
import com.example.rentACAr.entities.concretes.Brand;

import java.util.List;

public interface BrandService {
    List<GetAllBrandsResponse> BusinessGetBrands();
    void add(CreateBrandRequest createBrandRequest);
}
