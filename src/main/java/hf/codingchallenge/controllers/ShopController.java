package hf.codingchallenge.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hf.codingchallenge.entities.Shop;
import hf.codingchallenge.repositories.ShopRepository;

@RestController
@RequestMapping("/shops")
public class ShopController {
	
	@Autowired
	ShopRepository shopRepository;
	
	public ShopController(ShopRepository shopRepository) {
		this.shopRepository = shopRepository;
	}
	
	@GetMapping("/all")
	public List<Shop> getAll(){
		List<Shop> shops = this.shopRepository.findAll();
		return shops;
	}



}
