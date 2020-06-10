package com.saidus.serveurgestionstockproduits.repository;

import com.saidus.serveurgestionstockproduits.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Long> {

    Role findRoleByName(String name);
    Role findByName(String name);

}
