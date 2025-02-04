package be.technifutur.plateformevoisin.services;

import be.technifutur.plateformevoisin.entities.User;

public interface UserService {

    void RegisterUser(User user);
    User LoginUser(String email, String password);
    void UpdateUser(User user);
    void DeleteUser(User user);

}
