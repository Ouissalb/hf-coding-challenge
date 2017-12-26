package hf.codingchallenge.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import hf.codingchallenge.entities.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

	User getOneById(String email);

	User findByEmail(String email);
}
