package com.saidus.serveurgestionstockproduits.security;

import com.saidus.serveurgestionstockproduits.entity.Role;
import com.saidus.serveurgestionstockproduits.entity.User;
import com.saidus.serveurgestionstockproduits.repository.IUserRepository;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    //@Autowired
    private IUserRepository IUserRepository;

    public CustomUserDetailsService(IUserRepository IUserRepository) {
        this.IUserRepository = IUserRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //this.userRepository.findByUsername(username);
        User user = this.IUserRepository.findByUsername(username);

        boolean accountNonExpired = true;
        boolean credentialsNonExpired = true;
        boolean accountNonLocked = true;

        UserDetails userDetails = new org.springframework.security.core.userdetails.User(
                username,
                user.getPassword(),
                user.isEnable(),
                accountNonExpired,
                credentialsNonExpired,
                accountNonLocked,
                getAutorities(user.getRoles())
                );

        return userDetails;
    }

    private Collection<? extends GrantedAuthority> getAutorities(List<Role> roles) {
        Collection<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();
        for (Role role: roles) {
            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(role.getName()); // il faut qu'il commence par: ROLE_
            grantedAuthorities.add(grantedAuthority);
        }
        return grantedAuthorities;
    }


}
