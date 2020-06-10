package com.saidus.serveurgestionstockproduits.service.impl;

import com.saidus.serveurgestionstockproduits.entity.User;
import com.saidus.serveurgestionstockproduits.repository.IUserRepository;
import com.saidus.serveurgestionstockproduits.service.ICrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
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
        return this.userRepository.findAll();
    }

    @Override
    public void add(User user) {
        this.userRepository.save(user);
    }

    @Override
    public void update(User user) {
        this.userRepository.save(user);
    }

    @Override
    public void delete(Long id) {
        User user = new User();
        user.setId(id);
        this.userRepository.delete(user);
        // this.userRepository.deleteById(id);
    }

    @Override
    public void saveAll(Iterable<User> iterable) {
        this.userRepository.saveAll(iterable);

        /*Iterator<User> iterator = iterable.iterator();
        if(iterator.hasNext()) {
            this.userRepository.save(iterator.next());
        }*/
    }

}
