package hf.codingchallenge.service;

import java.io.IOException;
import java.lang.reflect.Array;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.maxmind.geoip2.exception.GeoIp2Exception;

import hf.codingchallenge.entities.GeoIP;
import hf.codingchallenge.entities.User;
import hf.codingchallenge.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	

    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
}
    
	public User save(User user) {
		user.setPassword(passwordEncoder().encode(user.getPassword()));
		 return userRepository.save(user);
}
	
	public User editUser(User user) {
		 return userRepository.save(user);
}
	
	public User getOneById(String id) {
		return userRepository.findOne(id);
}

	public GeoIP getLocationFromIp(String ip) throws IOException, GeoIp2Exception {
		
		return RawDBDemoGeoIPLocationService.getLocation(ip);
	}
	
}
