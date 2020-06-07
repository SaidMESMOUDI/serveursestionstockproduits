package com.saidus.serveurgestionstockproduits;

import com.saidus.serveurgestionstockproduits.entity.Produit;
import com.saidus.serveurgestionstockproduits.entity.Role;
import com.saidus.serveurgestionstockproduits.entity.User;
import com.saidus.serveurgestionstockproduits.repository.IProduitRepository;
import com.saidus.serveurgestionstockproduits.repository.RoleRepository;
import com.saidus.serveurgestionstockproduits.repository.UserRepository;
import com.saidus.serveurgestionstockproduits.util.RoleEnum;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class ServeurgestionstockproduitsApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(ServeurgestionstockproduitsApplication.class, args);

        IProduitRepository produitRepository = ctx.getBean(IProduitRepository.class);
        produitRepository.save(new Produit("Livre", 50, 20.75f));
        produitRepository.save(new Produit("Cahier", 27, 18.25f));
        produitRepository.save(new Produit("Stylo", 52, 12.3f));
        produitRepository.save(new Produit("Crayon", 34, 11.6f));
        produitRepository.save(new Produit("Gomme", 22, 19.7f));
        produitRepository.save(new Produit("Red Pen", 87, 19.9f));

        RoleRepository roleRepository = ctx.getBean(RoleRepository.class);
        Role roleUser = new Role(RoleEnum.ROLE_USER);
        Role roleAdmin = new Role(RoleEnum.ROLE_ADMIN);
        roleRepository.save(roleUser);
        roleRepository.save(roleAdmin);

        UserRepository userRepository = ctx.getBean(UserRepository.class);

        User user = new User("user", "userpass", true);
        user.setRoles(Arrays.asList(roleUser));
        userRepository.save(user);

        User admin = new User("admin", "adminpass", true);
        admin.setRoles(Arrays.asList(roleUser, roleAdmin));
        userRepository.save(admin);
    }

}
