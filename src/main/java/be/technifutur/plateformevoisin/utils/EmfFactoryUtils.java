package be.technifutur.plateformevoisin.utils;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EmfFactoryUtils {

    public static EntityManagerFactory emf;

    public static EntityManagerFactory getEmfFactory() {
        if(emf == null) {
            emf = Persistence.createEntityManagerFactory("plateforme-voisins");
        }
        return emf;
    }
}
