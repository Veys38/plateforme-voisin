package be.technifutur.plateformevoisin.repositories;

import be.technifutur.plateformevoisin.entities.User;

public interface UserRepository extends BaseRepository<User, Long> {
    boolean existsByEmail(String email);

    User findByEmail(String email);


}
