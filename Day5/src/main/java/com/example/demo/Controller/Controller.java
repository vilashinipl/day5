package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.ProductDetails;
import com.example.demo.Service.ServiceDetails;
@RestController
@RequestMapping("/welcome")
public class Controller {
	@Autowired 
	ServiceDetails studentservice;
	
	@PostMapping(" ")
	public String create(@RequestBody ProductDetails stu)
	{
		return studentservice.adddetails(stu);
	}
	@GetMapping(" ")
	public List<ProductDetails> read()
	{
		return studentservice.getdetails();
	}
	@GetMapping("/{id}")
	public Optional<ProductDetails> readById(@PathVariable int id)
	{
		return studentservice.getdetailsById(id);
	}
	@PutMapping(value = "/update_ss")
	public String update(@RequestBody ProductDetails  stu) 
	{
		return studentservice.updateSS( stu);
	}
	@DeleteMapping(value = "/delete")
	public String delete(@RequestParam ("num") int id)
	{
		return studentservice.deleteByRequestParamId(id);
	}
}