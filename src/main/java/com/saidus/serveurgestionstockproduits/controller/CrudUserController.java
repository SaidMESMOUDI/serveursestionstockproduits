package com.saidus.serveurgestionstockproduits.controller;

import com.saidus.serveurgestionstockproduits.entity.User;
import com.saidus.serveurgestionstockproduits.service.ICrudService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "/crud_user")
public class CrudUserController {
    //@Autowired
    private ICrudService<User, Long> userService;

    public CrudUserController(ICrudService<User, Long> userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAll() {
        return userService.getAll();
    }

    @PostMapping
    public void add(@RequestBody User user) {
        userService.add(user);
    }

    @PutMapping
    public void update(@RequestBody User user) {
        userService.update(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        userService.delete(id);
    }
}
