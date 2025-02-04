package be.technifutur.plateformevoisin.repositories.impls;

import be.technifutur.plateformevoisin.repositories.BaseRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;
import java.util.Optional;

public abstract class BaseRepositoryImpl<TEntity, TId> implements BaseRepository<TEntity, TId> {

    protected final EntityManagerFactory emf;
    private final Class<TEntity> entityClass;

    protected BaseRepositoryImpl(Class<TEntity> entityClass) {
        this.emf = Persistence.createEntityManagerFactory("plateforme-voisins");
        this.entityClass = entityClass;
    }


    @Override
    public List<TEntity> findAll() {
        try(EntityManager em = emf.createEntityManager()) {
            return em.createQuery("select u from " + entityClass.getSimpleName() + " u", entityClass).getResultList();
        }
    }

    @Override
    public Optional<TEntity> findById(TId id) {
        try(EntityManager em = emf.createEntityManager()) {
            return Optional.ofNullable(em.find(entityClass, id));
        }
    }

    @Override
    public TEntity save(TEntity user) {
        try(EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();
            em.persist(user);
            em.getTransaction().commit();
            return user;
        }
    }

    @Override
    public TEntity update(TEntity user) {
        try(EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();
            TEntity result = em.merge(user);
            em.getTransaction().commit();
            return result;
        }
    }

    @Override
    public TEntity delete(TEntity user) {
        try(EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();
            user = em.merge(user);
            em.remove(user);
            em.getTransaction().commit();
            return user;
        }
    }
}
