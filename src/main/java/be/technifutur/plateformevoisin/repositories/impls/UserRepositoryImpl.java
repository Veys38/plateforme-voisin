package be.technifutur.plateformevoisin.repositories.impls;

import be.technifutur.plateformevoisin.entities.User;
import be.technifutur.plateformevoisin.repositories.UserRepository;
import jakarta.enterprise.context.SessionScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.io.Serializable;

@SessionScoped
public class UserRepositoryImpl extends BaseRepositoryImpl<User, Long> implements UserRepository, Serializable {


    public UserRepositoryImpl() {
        super(User.class);
    }

    @Override
    public boolean existsByEmail(String email) {
        try(EntityManager em = emf.createEntityManager()) {
            Query query = em.createQuery("SELECT count(u) > 0 FROM User u WHERE u.email = :email");
            query.setParameter("email", email);
            return (boolean) query.getSingleResult();
        }
    }

    @Override
    public User findByEmail(String email) {
        try(EntityManager em = emf.createEntityManager()) {
            Query query = em.createQuery("SELECT u FROM User u WHERE u.email = :email");
            query.setParameter("email", email);
            return (User) query.getSingleResult();
        }

    }
}
