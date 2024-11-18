package com.example.rentACAr.dataAccess.abstracts;

import com.example.rentACAr.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BrandRepository extends JpaRepository<Brand,Integer> {

}
