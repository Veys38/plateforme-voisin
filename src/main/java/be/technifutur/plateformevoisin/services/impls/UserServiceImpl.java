package be.technifutur.plateformevoisin.services.impls;

import be.technifutur.plateformevoisin.entities.User;
import be.technifutur.plateformevoisin.repositories.UserRepository;
import be.technifutur.plateformevoisin.repositories.impls.UserRepositoryImpl;
import be.technifutur.plateformevoisin.services.UserService;
import jakarta.enterprise.context.SessionScoped;
import jakarta.enterprise.inject.spi.CDI;
import jakarta.inject.Inject;
import org.mindrot.jbcrypt.BCrypt;

import java.io.Serializable;
import java.util.Optional;

@SessionScoped
public class UserServiceImpl implements UserService, Serializable {

    @Inject
    private UserRepository userRepository;

    public UserServiceImpl() {
        userRepository = CDI.current().select(UserRepositoryImpl.class).get();
        if (userRepository == null) {
            System.out.println("UserRepository is NULL");
        } else {
            System.out.println("UserRepository is injected correctly");
        }
    }

    @Override
    public void RegisterUser(User user) {
        if (userRepository.existsByEmail(user.getEmail())) {
            throw new IllegalArgumentException("The e-mail is already in use !");
        }
        String hashedPassword = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
        user.setPassword(hashedPassword);
        user.setActive(true);
        userRepository.save(user);

    }

    @Override
    public User LoginUser(String email, String password) {
        User user = userRepository.findByEmail(email);
        if (user==null) {
            throw new IllegalArgumentException("The e-mail does not exist !");
        }
        if (!BCrypt.checkpw(password, user.getPassword())) {
            throw new IllegalArgumentException("The password is wrong !");
        }
        return user;
    }

    @Override
    public void UpdateUser(User user) {
        userRepository.update(user);
    }

    @Override
    public void DeleteUser(User user) {
        userRepository.delete(user);
    }
}
