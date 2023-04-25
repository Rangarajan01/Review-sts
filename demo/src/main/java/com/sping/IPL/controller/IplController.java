package com.sping.IPL.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sping.IPL.service.IPLservice;

@RestController
@RequestMapping("/api/ipl")
public class IplController {
	@Autowired
	private IPLservice Service;
	@GetMapping
	public List<IPL> read(){
		 return service.getIpl();
	}
	@GetMapping()
	public Optional<Ipl> readbyId(@PathVariable int id)  {
		return service.getIplId(id);
		
	}
	@PostMapping
	public Ipl create(@RequestBody IPL Ipl) {
		return service.addIPL(Ipl);
	}
	@PostMapping("/{id}")
	public Ipl update(@PathVariable int id, @RequestBody IPl Ipl) {
		return service.editIPL(id, Ipl);
		
	}
	@DeleteMapping("/{id}")
	public String delete(@PathVariable int id) {
		return service.deleteIpl(id);
	}
} 
