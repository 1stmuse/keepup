package com.muse.keepup.user.services;

import com.muse.keepup.user.repository.UserRepositoryInterface;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomUserDetailService implements UserDetailsService {

    private final UserRepositoryInterface userRepositoryInterface;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepositoryInterface.findByEmail(username).orElseThrow(() -> new UsernameNotFoundException("User mot found"));
    }
}
