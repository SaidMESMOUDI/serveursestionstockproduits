package com.saidus.serveurgestionstockproduits;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ServeurgestionstockproduitsApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(ServeurgestionstockproduitsApplication.class, args);

       /* IProductRepository productRepository = ctx.getBean(IProductRepository.class);
        productRepository.save(new Product("Livre", 50, 20.75f));
        productRepository.save(new Product("Cahier", 27, 18.25f));
        productRepository.save(new Product("Stylo", 52, 12.3f));
        productRepository.save(new Product("Crayon", 34, 11.6f));
        productRepository.save(new Product("Gomme", 22, 19.7f));
        productRepository.save(new Product("Red Pen", 87, 19.9f));

        IRoleRepository roleRepository = ctx.getBean(IRoleRepository.class);
        Role roleUser = new Role(RoleEnum.ROLE_USER);
        Role roleAdmin = new Role(RoleEnum.ROLE_ADMIN);
        roleRepository.save(roleUser);
        roleRepository.save(roleAdmin);

        IUserRepository userRepository = ctx.getBean(IUserRepository.class);

        User user = new User("user", "userpass", true);
        user.setRoles(Arrays.asList(roleUser));
        userRepository.save(user);

        User admin = new User("admin", "adminpass", true);
        admin.setRoles(Arrays.asList(roleUser, roleAdmin));
        userRepository.save(admin);*/
    }

}
