package com.example.springblog2.services;

import com.example.springblog2.models.UserWithRoles;
import com.example.springblog2.models.User;
import com.example.springblog2.models.UserWithRoles;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.example.springblog2.repositories.UserRepository;

import java.util.Collection;

@Service
public class UserDetailsLoader implements UserDetailsService {

    private final UserRepository userDao;

    public UserDetailsLoader(UserRepository userDao) {
        this.userDao = userDao;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDao.findByUsername(username);
        if(user == null) {
            throw new UsernameNotFoundException("No user found for: " + username);
        }
        // instantiate a new User through the super constructor.
        return new UserWithRoles(user);
    }
}
