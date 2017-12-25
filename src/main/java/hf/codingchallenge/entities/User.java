package hf.codingchallenge.entities;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {

	@Id
	private String id;
	private String email;
	private String password;
	private List<User> users;
	private List<String> preferredShopsList; //Ids of preferred shops
	private List<String> dislikedShopsList;  //Ids of disliked shops


	public User() {
		this.users = new ArrayList<>();
		this.preferredShopsList = new ArrayList<>();
		this.dislikedShopsList =  new ArrayList<>();
	}
	
	public User(String email, String password, List<User> users, 
			List<String> preferredShopsList, List<String> dislikedShopsList) {
		super();
		this.email = email;
		this.password = password;
		this.users = users;
		this.preferredShopsList = preferredShopsList;
		this.dislikedShopsList = dislikedShopsList;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<String> getDislikedShopsList() {
		return dislikedShopsList;
	}

	public void setDislikedShopsList(List<String> dislikedShopsList) {
		this.dislikedShopsList = dislikedShopsList;
	}

	public List<String> getPreferredShopsList() {
		return preferredShopsList;
	}

	public void setPreferredShopsList(List<String> preferredShopsList) {
		this.preferredShopsList = preferredShopsList;
	}


}
