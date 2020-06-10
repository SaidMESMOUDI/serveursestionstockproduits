package com.saidus.serveurgestionstockproduits.controller;

import com.saidus.serveurgestionstockproduits.entity.Role;
import com.saidus.serveurgestionstockproduits.entity.User;
import com.saidus.serveurgestionstockproduits.repository.IRoleRepository;
import com.saidus.serveurgestionstockproduits.repository.IUserRepository;
import com.saidus.serveurgestionstockproduits.util.RoleEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/crud_user")
public class CrudUserController extends CrudController<User, Long> {

    @Autowired
    private IRoleRepository roleRepository;

    @Autowired
    private IUserRepository userRepository;

    public List<User> getAll() {
        List<User> users = super.getAll();
        users.forEach(user -> user.setPassword(null));
        return users;
    }

    public void add(@RequestBody User user) {
        Role roleUser = this.roleRepository.findByName(RoleEnum.ROLE_USER.getName());
        user.setEnable(true);
        user.setRoles(Arrays.asList(roleUser));
        super.add(user);
    }

}
