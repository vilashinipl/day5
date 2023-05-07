package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.ProductDetails;
import com.example.demo.Repository.RepoClass;

@Service
public class ServiceDetails {
	@Autowired 
	RepoClass s_repo;
	public String adddetails(ProductDetails stu)
	{
		s_repo.save(stu);
		return "Welcome to REST API";
	}
	public List<ProductDetails> getdetails()
	{
		return s_repo.findAll();
	}
	public Optional<ProductDetails> getdetailsById(int id)
	{
		return s_repo.findById(id);
	}
	public String updateSS(ProductDetails stu)
	{
		s_repo.save(stu);
		return "Updated!";
	}
	public String deleteByRequestParamId(int id)
	{
		s_repo.deleteById(id);
		return "Deleted!";
	}
}