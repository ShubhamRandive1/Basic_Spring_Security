package com.project.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.project.Models.MyUserDetails;
import com.project.Models.User;
import com.project.Repository.UserRepository;

@Service
public class MyUserService implements UserDetailsService{
	
	@Autowired
	public UserRepository userRepo;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<User> user = userRepo.findByUserName(username);
		
		user.orElseThrow(()-> new UsernameNotFoundException("Not Found :"+ username));
		
		return user.map(MyUserDetails::new).get();
	}
	
	

}
