package com.saidus.serveurgestionstockproduits.repository;

import com.saidus.serveurgestionstockproduits.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {
    User findUserById(Long id);
    User findUserByUsername(String username);
    User findUserByUsernameAndPassword(String username, String password);
    User findByUsername(String str);

}
