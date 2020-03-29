package com.khuranasvivek.experts.web;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.khuranasvivek.experts.domain.User;

@RestController
@RequestMapping("/experts")
public class UserController {
	
	@RequestMapping("/")
	public String index() {
    	return "Welcome to Explore Experts.";
	}
    
    @GetMapping("teams")
	public List<String> getAllTeams() {
    	List<String> teams = new ArrayList<String>();
    	teams.add("Taj");
    	teams.add("Shatabdi");
    	teams.add("Zeus");
    	teams.add("Hercules");
		return teams;
	}
    
    @GetMapping("teams/{teamname}")
	public List<User> getTeamMembers(@PathVariable("teamname") @NotBlank @Size(max = 15) String teamname) {
    	List<User> users = new ArrayList<User>();
    	
    	if(teamname.equals("shatabdi")) {
    		users.add(new User("Akinder", "Last Name", "Shatabdi", "Expert in Java"));
    		users.add(new User("Sachindra", "Last Name", "Shatabdi", "Expert in Java"));
    		users.add(new User("Swati", "Last Name", "Shatabdi", "Expert in Java"));
    		users.add(new User("Shrini", "Last Name", "Shatabdi", "Expert in Project Management"));
    	}
    	
    	if(teamname.equals("hercules")) {
    		users.add(new User("Archita", "Last Name", "Shatabdi", "Expert in Java"));
    		users.add(new User("Ankur", "Last Name", "Shatabdi", "Expert in Java"));
    		users.add(new User("Nidhi", "Last Name", "Shatabdi", "Expert in Automation Teating"));
    		users.add(new User("Vivek", "Last Name", "Shatabdi", "Expert in Java"));
    		users.add(new User("Satyajeet", "Last Name", "Shatabdi", "Expert in Project Management"));
    	}
    	
    	if(teamname.equals("zeus")) {
    		users.add(new User("Naresh", "Last Name", "Shatabdi", "Expert in Java"));
    		users.add(new User("Rudra", "Last Name", "Shatabdi", "Expert in Java"));
    		users.add(new User("Manisha", "Last Name", "Shatabdi", "Expert in Java"));
    		users.add(new User("Stuti", "Last Name", "Shatabdi", "Expert in Automation Teating"));
    		users.add(new User("Naveen", "Last Name", "Shatabdi", "Expert in Java"));
    		users.add(new User("Sachin T", "Last Name", "Shatabdi", "Expert in Project Management"));
    	}
    	
    	if(teamname.equals("taj")) {

    		users.add(new User("Vinod", "Last Name", "Shatabdi", "Expert in Java"));
    		users.add(new User("Siddharth", "Last Name", "Shatabdi", "Expert in Java"));
    		users.add(new User("Sachin M", "Last Name", "Shatabdi", "Expert in Java"));
    		users.add(new User("Sachin S", "Last Name", "Shatabdi", "Expert in Java"));
    		users.add(new User("Prakash", "Last Name", "Shatabdi", "Expert in Java"));
    		users.add(new User("Abhishek", "Last Name", "Shatabdi", "Expert in Project Management"));
    	
    	}
    	
    	
		return users;
	}
    
}