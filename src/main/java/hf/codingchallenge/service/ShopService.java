package hf.codingchallenge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hf.codingchallenge.entities.Shop;
import hf.codingchallenge.repositories.ShopRepository;

@Service
public class ShopService {

	@Autowired
	ShopRepository shopRepository;
	
	public List<Shop> getAllShops(){
		return shopRepository.findAll();
	}

}
