package javaloginsecurity.loginsystem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javaloginsecurity.loginsystem.config.UserPrincipal;
import javaloginsecurity.loginsystem.dao.UserRepository;
import javaloginsecurity.loginsystem.model.User;

@Service
public class UserDataService implements UserDetailsService{

	@Autowired
	private UserRepository repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = repo.findByUsername(username);
		
		if(user == null) {
			throw new UsernameNotFoundException("User not found");
		}
		
		return new UserPrincipal(user);
	}
}
