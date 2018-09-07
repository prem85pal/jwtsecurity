package com.jwtsecurity.service;

import com.jwtsecurity.model.MyUserDetails;
import com.jwtsecurity.model.User;
import com.jwtsecurity.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    private static final Logger logger = LoggerFactory.getLogger(MyUserDetailsService.class);

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);

        if (user == null) {
            throw new UsernameNotFoundException(String.format("No user found with username '%s'.", username));
        } else {
            logger.debug("fetch data from user table and store in MyUserDetails object");
            return create(user);
        }
    }

    private UserDetails create(User user) {
        return new MyUserDetails(user.getId(), user.getUsername(), user.getPassword(), null, true);
    }

}
