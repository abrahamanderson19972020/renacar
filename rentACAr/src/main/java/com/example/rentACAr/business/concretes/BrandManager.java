package com.example.rentACAr.business.concretes;

import com.example.rentACAr.business.abstracts.BrandService;
import com.example.rentACAr.business.requests.CreateBrandRequest;
import com.example.rentACAr.business.responses.GetAllBrandsResponse;
import com.example.rentACAr.dataAccess.abstracts.BrandRepository;
import com.example.rentACAr.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;
    @Autowired
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<GetAllBrandsResponse> BusinessGetBrands() {

        List<Brand> brands = this.brandRepository.findAll();
        List<GetAllBrandsResponse> brandsResponses = new ArrayList<>();
        for(Brand brand:brands)
        {
            GetAllBrandsResponse responseItem = new GetAllBrandsResponse();
            responseItem.setId(brand.getId());
            responseItem.setName(brand.getName());
            brandsResponses.add(responseItem);
        }
        return brandsResponses;
    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {
        Brand brand = new Brand();
        brand.setName(createBrandRequest.getName());
        this.brandRepository.save(brand);
    }
}
