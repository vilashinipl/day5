package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.ProductDetails;

public interface RepoClass extends JpaRepository<ProductDetails,Integer>{

}
