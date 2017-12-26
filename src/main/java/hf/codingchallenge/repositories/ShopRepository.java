package hf.codingchallenge.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import hf.codingchallenge.entities.Shop;

@Repository
public interface ShopRepository extends MongoRepository<Shop, String>{

	
}
