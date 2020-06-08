package com.saidus.serveurgestionstockproduits.service.impl;

import com.saidus.serveurgestionstockproduits.entity.User;
import com.saidus.serveurgestionstockproduits.repository.IUserRepository;
import com.saidus.serveurgestionstockproduits.service.ICrudService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class UserServiceImpl implements ICrudService<User, Long> {

    //@Autowired
    private IUserRepository userRepository;

    public UserServiceImpl(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public void add(User user) {
        userRepository.save(user);
    }

    @Override
    public void update(User user) {
        userRepository.save(user);
    }

    @Override
    public void delete(Long id) {
        /*User user = new User();
        user.setId(id);
        userRepository.delete(user);*/
        userRepository.deleteById(id);
    }

    @Override
    public void saveAll(Iterable<User> iterable) {
        userRepository.saveAll(iterable);
    }

}
