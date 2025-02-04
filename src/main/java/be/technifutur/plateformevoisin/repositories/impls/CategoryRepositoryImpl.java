package be.technifutur.plateformevoisin.repositories.impls;

import be.technifutur.plateformevoisin.entities.Category;
import be.technifutur.plateformevoisin.repositories.CategoryRepository;
import jakarta.enterprise.context.SessionScoped;

import java.io.Serializable;

@SessionScoped
public class CategoryRepositoryImpl extends BaseRepositoryImpl<Category, String> implements CategoryRepository, Serializable {

    protected CategoryRepositoryImpl() {
        super(Category.class);
    }
}
