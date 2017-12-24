package hf.codingchallenge.entities;
import org.springframework.data.annotation.Id;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "shops")
public class Shop {

	@Id
	private String id;
	private String picture;
	private String name;
	private String email;
	private String city;
	private String location;
	private List<Shop> shops;
	
	@Indexed(direction = IndexDirection.ASCENDING)
	protected double shopUserDistance; //Distance between logged in user and the shop
	
	
	public Shop() {this.shops = new ArrayList<>();}
	
	public Shop(String picture, String name, String email, String city, String location, List<Shop> shops) {
		super();
		this.picture = picture;
		this.name = name;
		this.email = email;
		this.city = city;
		this.location = location;
		this.shops = shops;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	public List<Shop> getShops() {
		return shops;
	}

	public void setShops(List<Shop> shops) {
		this.shops = shops;
	}
	
	
	
}
